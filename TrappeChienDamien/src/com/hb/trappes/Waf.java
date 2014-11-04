package com.hb.trappes;

public class Waf {
	private String son;
	
	public Waf(String son) {
		this.son = son;
	}
	
	public String getSon() {
		return son;
	}
	
	public boolean equals(Waf waf) {
		return (son.equals(waf.getSon())); 
	}
	

}
