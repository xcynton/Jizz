package com.jizz;

public class ReturnCall implements Executeable {

	private Object value;
	private int line;
	public ReturnCall(Object value,int line) {
		this.value = value;
		this.line = line;
	}
	
	@Override
	public void execute(Function method) {
		method.setReturnValue(value);
		method.setReturned(true);
	}

	@Override
	public int getLine() {
		return line;
	}

}
