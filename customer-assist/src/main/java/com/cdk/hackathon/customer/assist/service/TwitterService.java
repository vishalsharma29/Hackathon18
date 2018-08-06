package com.cdk.hackathon.customer.assist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TwitterService {

    @Resource
    private Twitter twitter;

    @Autowired
    private MonkeyLearnService monkeyLearnService;

    public QueryResult getTwitterUserMentions(final String queryString) {
        QueryResult search = null;
        try {
            search = twitter.search().search(new Query().query(queryString));
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return search;
    }

    public int shouldFindPostiveSentiments(final String query) {
        final QueryResult twitterUserMentions = getTwitterUserMentions(query);
        final List<Status> tweets = twitterUserMentions.getTweets();
        return monkeyLearnService.fetchPositiveSentiments(tweets);
    }
}
