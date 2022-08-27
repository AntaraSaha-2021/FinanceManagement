package com.example.finance.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emicard")
public class EmiCard {
	
	@Id
	//Unidirectional
	private String card_type;

	private Date validity;
	private String card_limit;

	@OneToOne(cascade=CascadeType.ALL, mappedBy = "cardtype")
	private CardDetails cardDetails;
}
