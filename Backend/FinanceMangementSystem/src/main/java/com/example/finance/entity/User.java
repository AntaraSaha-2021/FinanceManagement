package com.example.finance.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="userDetails")
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long reg_id;
	private String user_name;
	private long ph_number;
	private String email;
	private String user_password;
	private String address;
	private String card_type;
	private String bank_name;
	private String acc_number;
	private String ifsc_code;
	private String isVerified="False";
	private Date applied_on=Date.valueOf(LocalDate.now());
	
	
}
