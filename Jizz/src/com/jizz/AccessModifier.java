package com.jizz;

public enum AccessModifier{
	PUBLIC("pu"),
	PRIVATE("pr")
	;
	
	private final String keyword;
	private AccessModifier(String acc) {
		keyword = acc;
	}
	public String getKeyword() {
		return keyword;
	}
}
