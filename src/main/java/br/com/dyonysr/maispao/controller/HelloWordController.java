package br.com.dyonysr.maispao.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWordController {

    @GetMapping("ola-mundo")
    public ResponseEntity helloWord() {

        return ResponseEntity.ok("Fala Nelmissom, blz?");
    }


}
