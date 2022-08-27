package com.example.finance.entity;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")


public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	private String p_name;
	private String p_description;
	private String p_image; 
	private int price; 
	private int emi_3months;
	private int emi_6months;
	private int emi_9months;
	private int emi_12months;
 
	
 

}
