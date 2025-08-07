package org.example.policy.service.service;

import lombok.RequiredArgsConstructor;
import org.example.policy.service.model.Policy;
import org.example.policy.service.repository.PolicyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Service
public class PolicyService {

    private final PolicyRepository policyRepository;

    public Policy getPolicyByKey(String key) {
        return policyRepository.findByPolicyKey(key)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not found"));
    }
}
