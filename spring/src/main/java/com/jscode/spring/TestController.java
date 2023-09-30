package com.jscode.spring;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("name")
    public String name() {
        String name = "bc";
        return name;
    }

    @GetMapping("hello")
    public String query(@RequestParam String name) {
        return "안녕하세요 {쿼리 파라미터로 받아온 "+name+"}입니다.";
    }

    @GetMapping("api/test/{name}")
    public String path(@PathVariable String name){
        return "안녕하세요 {path로 받아온 "+name+"}입니다.";
    }

    @PostMapping("api/test")
    public String body(@RequestBody String name){
        return "안녕하세요 {requestBody로 받아온 "+name+"}입니다.";
    }

}
