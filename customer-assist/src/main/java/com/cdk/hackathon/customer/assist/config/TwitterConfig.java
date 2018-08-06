package com.cdk.hackathon.customer.assist.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Configuration
// @PropertySource(value = "file:/opt/secrets/app.properties", ignoreResourceNotFound = true)
public class TwitterConfig {
    @Value("${twitter.consumer.key}")
    private String oauth_consumer_key;
    @Value("${twitter.consumer.secret}")
    private String oauth_consumer_secret;
    @Value("${twitter.access.key}")
    private String oauth_access_key;
    @Value("${twitter.access.secret}")
    private String oauth_access_key_secret;

    @Bean
    public Twitter twitter() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setPrettyDebugEnabled(true);
        cb.setJSONStoreEnabled(true);
        cb.setOAuthConsumerKey(oauth_consumer_key);
        cb.setOAuthConsumerSecret(oauth_consumer_secret);
        cb.setOAuthAccessToken(oauth_access_key);
        cb.setOAuthAccessTokenSecret(oauth_access_key_secret);

        return new TwitterFactory(cb.build()).getInstance();
    }

}
