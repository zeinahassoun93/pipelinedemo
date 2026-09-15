package com.example.pipelinedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class HelloController {

    @Value("${app.version:local}")
    private String version;

    @GetMapping("/")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Hello from the pipeline!",
            "version", version
        );
    }
}