package com.jizz.compiler.exceptions;

public class WrongParamsException extends CompilerException {
	private static final long serialVersionUID = 7947961600428134418L;

	private String completeCode;
	private String partitial;
	private String file;
	private int line;
	
	
	public WrongParamsException(String completeCode, String partitial, String file, int line) {
		super();
		this.completeCode = completeCode;
		this.partitial = partitial;
		this.file = file;
		this.line = line;
	}

	@Override
	public String getCode() {
		return completeCode;
	}

	@Override
	public String getWrongOrMissing() {
		// TODO Auto-generated method stub
		return partitial;
	}

	@Override
	public String getFile() {
		// TODO Auto-generated method stub
		return file;
	}

	@Override
	public String getDescription() {
		return "The parameters in this method call are wrong";
	}

	@Override
	public int line() {
		return line;
	}

}
