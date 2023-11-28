package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.OrganizationDto;
import com.example.entity.Organization;
import com.example.service.OrganizationService;

@RestController
@RequestMapping("api/organizations")
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;

	@PostMapping
	public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
	OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
	return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("{code}")
	public ResponseEntity<OrganizationDto> getOrganization(@PathVariable("code") String OrganizationCode){
	
	OrganizationDto organizationDto= organizationService.getOrganizationByCode(OrganizationCode);
	return ResponseEntity.ok(organizationDto);
		
	}
	
	
}
