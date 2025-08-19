package com.ong.backend.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    
    @GetMapping("/")
    public ResponseEntity<String> root() {
        return ResponseEntity.ok("Backend ONG está funcionando! 🚀");
    }
    
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("timestamp", Instant.now().toString());
        response.put("service", "ONG Backend");
        response.put("version", "0.0.1-SNAPSHOT");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/api/test")
    public ResponseEntity<Map<String, String>> apiTest() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "API está funcionando perfeitamente!");
        response.put("timestamp", Instant.now().toString());
        response.put("environment", "Azure App Service");
        return ResponseEntity.ok(response);
    }
}