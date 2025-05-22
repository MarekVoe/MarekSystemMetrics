package dev.marekvoe.mareksystemmetrics.controllers;


import dev.marekvoe.mareksystemmetrics.models.NetworkInfo;
import dev.marekvoe.mareksystemmetrics.services.NetworkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetworkController {

    private final NetworkService networkService;

    public NetworkController(NetworkService networkService) {
        this.networkService = networkService;
    }

    @GetMapping("/api/network")
    public NetworkInfo getNetworkInfo() {
        return networkService.getNetworkInfo();
    }
}
