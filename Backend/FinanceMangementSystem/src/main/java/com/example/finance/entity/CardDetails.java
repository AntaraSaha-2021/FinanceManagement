package com.example.finance.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class CardDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="reg_id", referencedColumnName = "regId")
	private User user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="card_type", referencedColumnName = "cardType")
	private EmiCard cardtype;
 private int card_number;
 private Date validity;
 private int init_balance;
 private int avail_balance;
}
