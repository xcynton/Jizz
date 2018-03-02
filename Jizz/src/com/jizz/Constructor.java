package com.jizz;

import java.util.ArrayList;
import java.util.HashMap;

public class Constructor extends Function{
	private JizzClass clazz;
	
	public Constructor(JizzClass clazz) {
		super();
		this.clazz = clazz;
	}
	/**
	 * @deprecated not used
	 */
	@Deprecated
	@Override
	public void setName(String mod) {}
	/**
	 * @deprecated not used
	 */
	@Deprecated
	@Override
	public void setReturnType(String returnType) {}
	@Override
	public String getName() {
		String[] namespace = clazz.getDeclaration().split("\\.");
		return namespace[namespace.length-2];
	}
	@Override
	public String getReturnType() {
		return clazz.getDeclaration();
	}
}
