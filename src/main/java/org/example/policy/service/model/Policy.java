package org.example.policy.service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "policy")
public class Policy {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "policy_key", nullable = false, unique = true)
    private String policyKey;

    @Column(name = "policy_value", nullable = false)
    private Integer policyValue;
}
