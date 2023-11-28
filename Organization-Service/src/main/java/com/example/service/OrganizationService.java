package com.example.service;

import com.example.dto.OrganizationDto;

public interface OrganizationService {
	
OrganizationDto saveOrganization(OrganizationDto organizationDto);

OrganizationDto getOrganizationByCode(String organizationCode);

}
