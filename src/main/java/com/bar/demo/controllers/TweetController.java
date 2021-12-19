package com.bar.demo.controllers;

import com.bar.demo.model.Tweet;
import com.bar.demo.service.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequestMapping(path = "tweets")
@AllArgsConstructor
public class TweetController {

    private TweetService tweetService;

    @PostMapping(path = "post.tweet")
    public void postTweet(@RequestParam(value = "authorid") Long authorid,
                          @RequestParam(value = "textualContent") String textualContent,
                          @RequestParam(value = "mediaContent", required = false) MultipartFile mediaContent,
                          @RequestParam(value = "usersMentioned", required = false) Long[] usersMentioned) {
        tweetService.postTweet(authorid, textualContent, mediaContent, usersMentioned);
    }

    @PostMapping(path = "update.tweet")
    public void updateTweet(@RequestParam(value = "tweetid") Long tweetid,
                            @RequestParam(value = "textualContent") String textualContent,
                            @RequestParam(value = "mediaContent", required = false) MultipartFile mediaContent,
                            @RequestParam(value = "usersMentioned", required = false) Long[] usersMentioned) {
        tweetService.updateTweet(tweetid, textualContent, mediaContent, usersMentioned);
    }

    @PostMapping(path = "delete.tweet")
    public void deleteTweet(@RequestParam("id") Long id) {
        tweetService.deleteTweet(id);
    }

    @PostMapping(path = "retweet")
    public void reTweet(@RequestParam("id") Long id) {
        tweetService.reTweet(id);
    }

    @PostMapping(path = "like.tweet")
    public void likeTweet(@RequestParam("id") Long id) {
        tweetService.likeTweet(id);
    }

    @PostMapping(path = "reply.to.tweet")
    public void replyToTweet(@RequestParam(value = "tweetid") Long tweetid,
                             @RequestParam(value = "textualContent") String textualContent,
                             @RequestParam(value = "mediaContent", required = false) MultipartFile mediaContent) {
        tweetService.replyToTweet(tweetid, textualContent, mediaContent);
    }

    @PostMapping(path = "set.bookmark")
    public void setBookmark(@RequestParam(value = "tweetid") Long tweetid,
                            @RequestParam(value = "userid") Long userid) {
        tweetService.setBookmark(tweetid, userid);
    }

    @PostMapping(path = "delete.bookmark")
    public void deleteBookmark(@RequestParam(value = "bookmarkid") Long bookmarkid) {
        tweetService.deleteBookmark(bookmarkid);
    }

    @PostMapping(path = "pin.tweet")
    public void setPin(@RequestParam(value = "tweetid") Long tweetid) {
        tweetService.pinTweet(tweetid);
    }

    @PostMapping(path = "delete.pin")
    public void deletePin(@RequestParam(value = "tweetid") Long tweetid) {
        tweetService.deletePin(tweetid);
    }
}
