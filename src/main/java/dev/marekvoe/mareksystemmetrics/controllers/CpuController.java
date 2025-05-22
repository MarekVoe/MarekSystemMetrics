package dev.marekvoe.mareksystemmetrics.controllers;

import dev.marekvoe.mareksystemmetrics.models.CpuInfo;
import dev.marekvoe.mareksystemmetrics.services.CpuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuController {

    private final CpuService cpuService;

    public CpuController(CpuService cpuService) {
        this.cpuService = cpuService;
    }

    @GetMapping("/api/cpu")
    public CpuInfo getCpuMetrics() {
        return cpuService.getCpuInfo();
    }
}

