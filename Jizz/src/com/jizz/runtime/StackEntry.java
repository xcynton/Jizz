package com.jizz.runtime;

import java.util.HashMap;

public class StackEntry extends HashMap<String, Integer> {
	private static final long serialVersionUID = 490716098733141855L;
	private MethodCall call;
	
	public StackEntry(MethodCall call) {
		this.call = call;
	}
	
	public MethodCall getCall() {
		return call;
	}
}
