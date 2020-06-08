package com.telsuko.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	@GeneratedValue
	private int aid;
	private String anme;
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnme() {
		return anme;
	}
	public void setAnme(String anme) {
		this.anme = anme;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", anme=" + anme + ", tech=" + tech + "]";
	}
	
	

}
