package com.jizz.compiler.exceptions;

public abstract class CompilerException extends Exception{
	private static final long serialVersionUID = 5423855153636347718L;
	public abstract String getCode();
	public abstract String getWrongOrMissing();
	public abstract String getFile();
	public abstract String getDescription();
	public abstract int line();
	@Override
	public String getMessage() {
		return getClass().getName()+" <"+getDescription()+"> at ("+getFile()+" : "+line()+") \""+getCode()+"\" > "+getWrongOrMissing();
	}
}
