package com.jsd.countysuggestion.controller;

import com.jsd.countysuggestion.model.County;
import com.jsd.countysuggestion.service.CountyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suggest")
public class CountyController {

    private final CountyService countyService;

    public CountyController(CountyService countyService) {
        this.countyService = countyService;
    }

    @PostMapping("/save")
    public List<County> saveAll(@RequestBody Iterable<County>  counties) {
        return countyService.saveAll(counties);
    }

    @GetMapping("/{keyword}")
    public List<County> analiseKeywordAndGetAllCountySuggestions(@PathVariable String keyword) {
        return countyService.analiseKeywordAndGetAllCountySuggestions(keyword);
    }

}
