package com.jizz.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import com.jizz.JizzClass;

public class Memory {
	/**
	 * The stack contains loads of hashMaps the Variables names and their reference Numbers (long)
	 */
	private static Stack<StackEntry> stack = new Stack<>();
	/**
	 * The Heap contais the Values (Variables) itsself and the matching reference Numbers (long)
	 */
	//TODO: Object to BasicJizzObject
	private static ArrayList<HashMap<Long, Object>> heaps = new ArrayList<>();
	
	private static HashMap<String, Long> accessible = new HashMap<>();
	
	private static long nextID = 0;
	
	public static void enterStack(MethodCall call) {
		stack.push(new StackEntry(call));
		int i = 0;
		for(String name : call.getFunc().getArguments().keySet()) {
			if(call.getAbsoluteValues()[i])
				addVariable(name , call.getFunc().getArguments().get(name));
			else {
				
			}
		}
	}
	
	public static void addVariable(String name,JizzClass type) {
		
	}
}
