package com.dashaun.demo.policy.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

    @GetMapping("/api/policies")
    public String policies() {
        return "[{\"number\":\"PL-40012\",\"customerId\":\"C-1001\","
                + "\"status\":\"ACTIVE\"}]";
    }

    @GetMapping("/api/policies/{number}")
    public String policy(@PathVariable String number) {
        return "{\"number\":\"" + number + "\",\"customerId\":\"C-1001\","
                + "\"product\":\"AUTO-PLUS\",\"status\":\"ACTIVE\","
                + "\"effective\":\"2026-01-01\",\"expires\":\"2026-12-31\","
                + "\"monthlyPremium\":184.50,\"quoteId\":\"Q-2026-0117\"}";
    }
}
