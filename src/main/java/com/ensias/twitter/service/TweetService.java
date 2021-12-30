package com.ensias.twitter.service;


import com.ensias.twitter.repo.tweets.TweetRepo;
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

    //affichage des boukmarks par user

    public void deleteBookmark(Long bookmarkid) {
        //get bookmark
        //delete bookmark
        //...
        System.out.println("Function : deleteBookmark");
    }

    public void pinTweet(Long tweetid) {
        //goal : display one of your own tweet at the top of your profile
        //check if a tweet is already pinned
        //if there is one -> reject operation
        //else -> set pinned = true;
        System.out.println("Function : pinTweet");
    }

    public void deletePin(Long tweetid) {
        //get tweet
        //set pinned = false;
        //...
        System.out.println("Function : deletePin");
    }

}
