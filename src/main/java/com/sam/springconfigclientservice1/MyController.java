package com.sam.springconfigclientservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    private DbSettings dbSettings;
    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("/")
    public String getSettings() {

        return dbSettings.toString();
    }

    @GetMapping("/refresh")
    public void refresh() {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<>("");
        String url = "http://localhost:" + serverSettings.getPort() + "/actuator/refresh";
        restTemplate.postForObject(url, request, String.class);
    }
}
