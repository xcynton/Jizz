package com.jizz.runtime;

import com.jizz.Executeable;
import com.jizz.Function;
import com.jizz.compiler.exceptions.WrongParamsException;
import com.jizz.lib.JizzBasicObject;

public class MethodCall implements Executeable {
	private int calledFromLine;
	private boolean methodInClass;
	private String classThisMethodIsin;
	private Function func;
	private Function calledFrom;
	private boolean[] absoluteValues;
	private JizzBasicObject[] parametersAbsoluteValues;
	private String[] nonAbsoluteParameters;
	public MethodCall(int callLine,Function func,String args) {
		setCalledFromLine(callLine);
		this.func = func;
		String[] params = args.split(",");
		String dataType;
		setAbsoluteValues(new boolean[params.length]);
		for (int i = 0; i < params.length; i++) {
			String[] parts = params[i].split(" ");
			if(parts.length == 1 && i == 0) {
				//TODO: Correct file input
				WrongParamsException ex = new WrongParamsException(args, params[i], "init.jis", callLine);
				ex.printStackTrace();
				System.exit(6);
			}
			if(parts.length == 2){
				dataType = parts[0];
			}
		}
	}
	
	@Override
	public int getLine() {
		return calledFromLine;
	}

	@Override
	public void execute(Function method) {
		calledFrom = method;
		Memory.enterStack(this);
		func.execute(method);
	}

	/**
	 * {@link MethodCall#calledFromLine} 
	 * @return the calledFromLine
	 */
	public int getCalledFromLine() {
		return calledFromLine;
	}

	/**
	 * {@link MethodCall#calledFromLine} 
	 * @param calledFromLine the calledFromLine to set
	 */
	public void setCalledFromLine(int calledFromLine) {
		this.calledFromLine = calledFromLine;
	}

	/**
	 * {@link MethodCall#methodInClass} 
	 * @return the methodInClass
	 */
	public boolean isMethodInClass() {
		return methodInClass;
	}

	/**
	 * {@link MethodCall#methodInClass} 
	 * @param methodInClass the methodInClass to set
	 */
	public void setMethodInClass(boolean methodInClass) {
		this.methodInClass = methodInClass;
	}

	/**
	 * {@link MethodCall#classThisMethodIsin} 
	 * @return the type
	 */
	public String getType() {
		return classThisMethodIsin;
	}

	/**
	 * {@link MethodCall#classThisMethodIsin} 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.classThisMethodIsin = type;
	}

	/**
	 * {@link MethodCall#func} 
	 * @return the func
	 */
	public Function getFunc() {
		return func;
	}

	/**
	 * {@link MethodCall#func} 
	 * @param func the func to set
	 */
	public void setFunc(Function func) {
		this.func = func;
	}

	/**
	 * {@link MethodCall#calledFrom} 
	 * @param calledFrom the calledFrom to set
	 */
	public void setCalledFrom(Function calledFrom) {
		this.calledFrom = calledFrom;
	}
	
	public Function getCalledFrom() {
		return calledFrom;
	}

	public boolean[] getAbsoluteValues() {
		return absoluteValues;
	}

	public void setAbsoluteValues(boolean[] absoluteValues) {
		this.absoluteValues = absoluteValues;
	}

	public JizzBasicObject[] getParametersAbsoluteValues() {
		return parametersAbsoluteValues;
	}

	public void setParametersAbsoluteValues(JizzBasicObject[] parametersAbsoluteValues) {
		this.parametersAbsoluteValues = parametersAbsoluteValues;
	}

	public String[] getNonAbsoluteParameters() {
		return nonAbsoluteParameters;
	}

	public void setNonAbsoluteParameters(String[] nonAbsoluteParameters) {
		this.nonAbsoluteParameters = nonAbsoluteParameters;
	}

}
