package com.bar.demo.service;

import com.bar.demo.repo.TweetRepo;
import com.bar.demo.repo.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
@Transactional
public class SearchService {

    @Autowired
    private TweetRepo tweetRepo;
    @Autowired
    private UtilisateurRepo utilisateurRepo;

    public void searchTweetsByKeyword(String keyword) {
        //save search
        //...
        System.out.println("Function : searchTweetsByKeyWord");
    }

    public void searchTweetsByAuthor(Long idAuthor) {
        //save search
        //get author
        //...
        System.out.println("Function : searchTweetsByAuthor");
    }

    public void searchTweetsByTopic(Long idTopic) {
        //save search
        //get topic
        //...
        System.out.println("Function : searchTweetsByTopic");
    }

    public void searchTweetsByHashtag(Long idHashtag) {
        //save search
        //get hashtag
        //...
        System.out.println("Function : searchTweetsByHashtag");
    }

    public void searchTweetsBytimeInterval(Date startDate, Date endDate) {
        //save search
        //...
        System.out.println("Function : searchTweetsBytimeInterval");
    }

    public void deleteAllRecentSearches() {
        System.out.println("Function : deleteAllRecentSearches");
    }

    public void deleteSearch(Long searchid) {
        System.out.println("Function : deleteSearch");
    }

    public void searchUsersByKeyword(String keyword) {
        //save search
        //...
        System.out.println("Function : searchUsersByKeyword");
    }

}
