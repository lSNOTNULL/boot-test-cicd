package org.example.boottestcicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fishcake")
public class FishCakeController {
    @GetMapping
    public ResponseEntity<List<FishCake>> list() {
        List<FishCake> fishCakes = List.of(new FishCake("스펀지밥"),new FishCake("뚱이"),new FishCake("징징이"),new FishCake("집게사장")); //
        return ResponseEntity.ok(fishCakes);
    }
}
