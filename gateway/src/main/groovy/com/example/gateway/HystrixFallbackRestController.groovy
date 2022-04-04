package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/fx-exchange/fallback")
    public Mono<String> getFxSvcMsg() {
        return Mono.just("No response fron Forex Service and will be back shortly");
    }

    @GetMapping("/cc-converter/fallback")
    public Mono<String> getCcSvcMsg() {
        return Mono.just("No response fron Currency Conversion Service and will be back shortly");
    }

}