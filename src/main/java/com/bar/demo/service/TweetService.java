package com.bar.demo.service;


import com.bar.demo.repo.TweetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class TweetService {

    @Autowired
    private TweetRepo tweetRepo;

    public void postTweet(Long authorid, String textualContent, MultipartFile mediaContent, Long[] usersMentioned) {
        //set date de creation
        //....
        //create tweet
        //save tweet
        System.out.println("Function : postTweet");
    }

    public void updateTweet(Long tweetid, String textualContent, MultipartFile mediaContent, Long[] usersMentioned) {
        //set date de modification
        //....
        //update attributes
        //save tweet
        System.out.println("Function : updateTweet");
    }

    public void deleteTweet(Long id) {
        //delete tweet
        System.out.println("Function : deleteTweet");
    }

    public void reTweet(Long idTweet) {
        //change date de creation to actual one
        //...
        //save the tweet with the actual author (same content)
        System.out.println("Function : reTweet");
    }

    public void likeTweet(Long idTweet) {
        //get tweet
        //increment countLikes + set countLikes
        //save tweet
        System.out.println("Function : likeTweet");
    }

    public void replyToTweet(Long tweetid, String textualContent, MultipartFile mediaContent) {
        //get tweet
        //create and save response
        //...
        System.out.println("Function : replyToTweet");
    }

    public void setBookmark(Long tweetid, Long userid) {
        //get tweet
        //get user
        //save bookmark
        //...
        System.out.println("Function : setBookmark");
    }
}
