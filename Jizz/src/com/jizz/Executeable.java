package com.jizz;

import java.io.Serializable;

public interface Executeable extends Serializable{
	public abstract void execute(Function method);
	public int getLine();
}
