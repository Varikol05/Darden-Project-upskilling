package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long>{

	Organization findByOrganizationCode(String organizationCode);
}
