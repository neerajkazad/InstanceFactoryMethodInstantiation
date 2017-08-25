package com.ifmi.beans;

import com.ifmi.ext.beans.IGoogleEngine;

public class GeoMapUI {
	private IGoogleEngine googleEngine;
	public void render(String source, String destination) {
		String[] coordinate = null;
		coordinate = googleEngine.getDirection(source,destination);
		for(String coordinates: coordinate) {
			System.out.println(coordinates);
		}
	}
	public void setGoogleEngine(IGoogleEngine googleEngine) {
		this.googleEngine = googleEngine;
	}
	@Override
	public String toString() {
		return "GeoMapUI [googleEngine=" + googleEngine + "]";
	}
		
	
}
