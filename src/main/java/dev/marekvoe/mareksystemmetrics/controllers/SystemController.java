package dev.marekvoe.mareksystemmetrics.controllers;


import dev.marekvoe.mareksystemmetrics.models.SystemInfo;
import dev.marekvoe.mareksystemmetrics.services.SystemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {


    private final SystemService systemService;

    public SystemController(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping("/api/system")
    public SystemInfo getSystemInfo() {
        return systemService.getSystemInfo();
    }

}
