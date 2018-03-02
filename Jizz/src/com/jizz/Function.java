package com.jizz;

import java.util.ArrayList;
import java.util.HashMap;

public class Function implements Executeable {
	private AccessModifier mod = AccessModifier.PUBLIC;
	private String returnType = null;
	private String name;
	private int startLine;
	private boolean returned = false;
	private Object returnValue = null;
	/**
	 * KEY   = Name of the argument<br>
	 * VALUE = Data Type
	 */
	private HashMap<String, String> arguments = new HashMap<>();
	private ArrayList<Executeable> content = new ArrayList<>();
	
	@Override
	public void execute(Function fc) {
		for (Executeable executeable : content) {
			if(returned)
				break;
			executeable.execute(this);
		}
	}
	/**
	 * {@link Function#mod} 
	 * @return the mod
	 */
	public AccessModifier getMod() {
		return mod;
	}
	/**
	 * {@link Function#mod} 
	 * @param mod the mod to set
	 */
	public void setMod(AccessModifier mod) {
		this.mod = mod;
	}
	/**
	 * {@link Function#returnType} 
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}
	/**
	 * {@link Function#returnType} 
	 * @param returnType the returnType to set
	 */
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	/**
	 * {@link Function#name} 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * {@link Function#name} 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * {@link Function#arguments} 
	 * @return the arguments
	 */
	public HashMap<String, String> getArguments() {
		return arguments;
	}
	/**
	 * {@link Function#arguments} 
	 * @param arguments the arguments to set
	 */
	public void setArguments(HashMap<String, String> arguments) {
		this.arguments = arguments;
	}
	
	public void addArgument(String name,String type) {
		this.arguments.put(name, type);
	}
	/**
	 * {@link Function#content} 
	 * @return the content
	 */
	public ArrayList<Executeable> getContent() {
		return content;
	}
	/**
	 * {@link Function#content} 
	 * @param content the content to set
	 */
	public void setContent(ArrayList<Executeable> content) {
		this.content = content;
	}
	public int getStartLine() {
		return startLine;
	}
	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}
	@Override
	public int getLine() {
		return startLine;
	}
	public Object getReturnValue() {
		return returnValue;
	}
	public void setReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}
	public boolean isReturned() {
		return returned;
	}
	public void setReturned(boolean returned) {
		this.returned = returned;
	}

}
