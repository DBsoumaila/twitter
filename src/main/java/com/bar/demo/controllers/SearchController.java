package com.bar.demo.controllers;

import com.bar.demo.service.SearchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "searches")
@AllArgsConstructor
public class SearchController {

    private SearchService searchService;

}
