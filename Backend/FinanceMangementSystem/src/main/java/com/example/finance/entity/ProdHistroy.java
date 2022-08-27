package com.example.finance.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
public class ProdHistroy {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long prod_hist_id;
	
	@ManyToOne(targetEntity= User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="reg_id",referencedColumnName="regId")
	private User user;
	
	@ManyToOne(targetEntity= Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="product_id",referencedColumnName="productId")
	private Product product;
	
	private String p_name;
	private float amt_paid;
	private float emi_paid;
	private float amt_bal;
	private float price;
	private Date purchaseDate;
}
