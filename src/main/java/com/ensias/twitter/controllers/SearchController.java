package com.ensias.twitter.controllers;

import com.ensias.twitter.service.SearchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "searches")
@AllArgsConstructor
public class SearchController {

    private SearchService searchService;

    @PostMapping(path = "tweets.keyword")
    public void searchTweetsByKeyword(@RequestParam(value = "keyword") String keyword) {
        searchService.searchTweetsByKeyword(keyword);
    }

    @PostMapping(path = "tweets.author")
    public void searchTweetsByAuthor(@RequestParam(value = "idAuthor") Long idAuthor) {
        searchService.searchTweetsByAuthor(idAuthor);
    }

    @PostMapping(path = "tweets.topic")
    public void searchTweetsByTopic(@RequestParam(value = "idTopic") Long idTopic) {
        searchService.searchTweetsByTopic(idTopic);
    }

    @PostMapping(path = "tweets.hashtag")
    public void searchTweetsByHashtag(@RequestParam(value = "idHashtag") Long idHashtag) {
        searchService.searchTweetsByHashtag(idHashtag);
    }

    @PostMapping(path = "tweets.time.interval")
    public void searchTweetsBytimeInterval(@RequestParam(value = "startDate") Date startDate,
                                           @RequestParam(value = "endDate") Date endDate) {
        searchService.searchTweetsBytimeInterval(startDate, endDate);
    }

    @PostMapping(path = "delete.searches")
    public void deleteAllRecentSearches() {
        searchService.deleteAllRecentSearches();
    }

    @PostMapping(path = "delete.searche")
    public void deleteSearch(@RequestParam(value = "idSearch") Long idSearch) {
        searchService.deleteSearch(idSearch);
    }

    @PostMapping(path = "users.keyword")
    public void searchUsersByKeyword(@RequestParam(value = "keyword") String keyword) {
        searchService.searchUsersByKeyword(keyword);
    }

}
