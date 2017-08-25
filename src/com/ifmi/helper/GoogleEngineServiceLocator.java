package com.ifmi.helper;

import com.ifmi.ext.beans.IGoogleEngine;
import com.ifmi.ext.beans.IndiaGoogleEngine;
import com.ifmi.ext.beans.UsGoogleEngine;

public class GoogleEngineServiceLocator {
	public IGoogleEngine locateIndiaGoogleEngine() {
		//lookup logic to acquire remote application object
		return new IndiaGoogleEngine();
	}
	
	public IGoogleEngine locateUsGoogleEngine() {
		//lookup logic to acquire remote application object
		return new UsGoogleEngine();
	}
}
