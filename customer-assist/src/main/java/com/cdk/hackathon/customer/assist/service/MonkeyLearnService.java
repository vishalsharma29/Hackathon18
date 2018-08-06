package com.cdk.hackathon.customer.assist.service;

import com.monkeylearn.MonkeyLearn;
import com.monkeylearn.MonkeyLearnException;
import com.monkeylearn.MonkeyLearnResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import twitter4j.Status;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonkeyLearnService {

    @Value("${monkeylearn.oauth.key}")
    private String oauth_ml_key;

    @Value("${monkeylearn.sentiment_classifier}")
    private String sentiment_classifier;

    public int fetchPositiveSentiments(final List<Status> tweets) {
        MonkeyLearn ml = new MonkeyLearn(oauth_ml_key);
        final List<String> tweetsTextList = tweets.stream().map(t -> t.getText()).collect(Collectors.toList());
        final String[] tweetTexts = tweetsTextList.toArray(new String[tweetsTextList.size()]);
        int reviews = 0;
        try {
            MonkeyLearnResponse res = ml.classifiers.classify(sentiment_classifier, tweetTexts);
            reviews = parseResponseToGetReviews(reviews, res);
        } catch (MonkeyLearnException e) {
            e.printStackTrace();
        }
        return reviews;
    }

    public int parseResponseToGetReviews(int reviews, MonkeyLearnResponse res) {
        final Iterator<JSONArray> iterator = res.arrayResult.iterator();
        while(iterator.hasNext()) {
            final JSONArray next = (JSONArray) (iterator.next()).get(0);
            final JSONObject obj = (JSONObject) next.get(0);
            final String label = (String) obj.get("label");
            final Double probability = (Double) obj.get("probability");
            final Double confidence = (Double) obj.get("confidence");
            switch(label) {
                case  "Positive" : reviews++;
                    break;
                case  "Neutral" :
                    if (probability > 0.5 && confidence > 0.5) {
                        reviews++;
                    }
                    break;
                default: break;
            }
        }
        return reviews;
    }
}
