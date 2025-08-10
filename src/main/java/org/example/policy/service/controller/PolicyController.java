package org.example.policy.service.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.policy.service.model.Policy;
import org.example.policy.service.service.PolicyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Tag(name = "Policy", description = "Operations related to policies")
public class PolicyController {

    private final PolicyService policyService;

    @Operation(
            summary = "Get policy by id",
            description = "Retrieve a policy by its unique identifier"
    )
    @GetMapping("/{key}")
    public ResponseEntity<Policy> getPolicyByKey(
            @Parameter(description = "Policy Key to be searched") @PathVariable String key
    ) {
        return ResponseEntity.ok(policyService.getPolicyByKey(key));
    }

    @Operation(
            summary = "Get all policies",
            description = "Retrieve a list of all policies"
    )
    @GetMapping
    public ResponseEntity<List<Policy>> getAllPolicies() {
        return ResponseEntity.ok(policyService.getAllPolicies());
    }
}
