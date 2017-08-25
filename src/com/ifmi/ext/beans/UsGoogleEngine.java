package com.ifmi.ext.beans;

public class UsGoogleEngine implements IGoogleEngine {

	@Override
	public String[] getDirection(String source, String destination) {
		return new String[] {"{20,24}","{20,25}","{20,26}","{20,27}"};
	}
	
}
