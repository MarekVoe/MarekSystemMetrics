package dev.marekvoe.mareksystemmetrics.controllers;


import dev.marekvoe.mareksystemmetrics.models.MemoryInfo;
import dev.marekvoe.mareksystemmetrics.services.MemoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoryController {

    private final MemoryService memoryService;

    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @GetMapping("/api/memory")
    public MemoryInfo getMemoryInfo() {
        return memoryService.getMemoryInfo();
    }
}
