package com.org.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Book01")
public class Book1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bno;
	@Column(name ="bname")
	private String bname;
	@Column(name ="price")
	private int price;
	 public int getBno() {
		 return bno;
		 
		 
	 }
	 public void setBno(int bno) {
		 this.bno = bno;
		 }
		 public String getBname() {
		 return bname;
		 }
		 public void setBname(String bname) {
		 this.bname = bname;
		 }
		 public int getPrice() {
		 return price;
		 }
		 public void setPrice(int price) {
		 this.price = price;
		 }
}
