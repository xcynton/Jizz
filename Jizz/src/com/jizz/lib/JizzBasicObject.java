package com.jizz.lib;

import java.util.ArrayList;
import java.util.HashMap;

import com.jizz.Constructor;
import com.jizz.Field;
import com.jizz.Function;
import com.jizz.JizzClass;

import sun.management.jmxremote.ConnectorBootstrap;

public class JizzBasicObject extends JizzClass{
	private String typeDeclaration;

	@Override
	public String getDeclaration() {
		return "jizz.Object.jis";
	}

	@Override
	public ArrayList<Field> getFields() {
		return new ArrayList<>();
	}

	@Override
	public ArrayList<Function> getFunctions() {
		return new ArrayList<>();
	}

	@Override
	public ArrayList<Constructor> getConstructors() {
		ArrayList<Constructor> consts = new ArrayList<>();
		Constructor constructor = new Constructor(this);
		consts.add(constructor);
		return consts;
	}

	@Override
	public void addDependecies() {	
	}

	@Override
	public JizzClass getSuperClass() {
		return null;
	}

	@Override
	public HashMap<String, String> getFunctionsRedirects() {
		return new HashMap<>();
	}
	
}
