package com.yedam.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class StudentVO {

	private String stdNo;
	private String stdName;
	private String stdPhone;
	private String address;
	private String birthDate;
	
	
}
