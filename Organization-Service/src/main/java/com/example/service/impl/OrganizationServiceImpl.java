package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.OrganizationDto;
import com.example.entity.Organization;
import com.example.mapper.OrganizationMapper;
import com.example.repo.OrganizationRepository;
import com.example.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

@Autowired
private OrganizationRepository organizationRepository;
	
	
	
	
	@Override
	public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
		
	//convert OrganizationDto into Organization jpa entity
		
		Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
		
		Organization savedOrganization = organizationRepository.save(organization);
	
		return OrganizationMapper.mapToOrganizationDto(savedOrganization);
	}



   @Override
	public OrganizationDto getOrganizationByCode(String organizationCode) {
		Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
		
		return OrganizationMapper.mapToOrganizationDto(organization);
	}

}
