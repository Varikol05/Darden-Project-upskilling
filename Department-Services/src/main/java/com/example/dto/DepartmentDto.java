package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class DepartmentDto {
	
    private Long id;
	private String departmentName;
	private String departmentDescrption;
	private String departmentCode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDescrption() {
		return departmentDescrption;
	}
	public void setDepartmentDescrption(String departmentDescrption) {
		this.departmentDescrption = departmentDescrption;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public DepartmentDto(Long id, String departmentName, String departmentDescrption, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentDescrption = departmentDescrption;
		this.departmentCode = departmentCode;
	}
	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
