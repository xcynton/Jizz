package com.jizz;

/**
 * A field is an constant variable of an Class.<br>
 * @author ROOT
 */
public class Field {
	/**
	 * The name of the field. Used to call it
	 */
	private String  name;
	/**
	 * The Declaration of the type this variable is from
	 */
	private String type;
	/**
	 * {@link AccessModifier}
	 */
	private AccessModifier mod = AccessModifier.PRIVATE;
	/**
	 * The default value of the variable mostly <i>null</i><br>
	 * 
	 * @deprecated because i need to change the type from {@link Object} to the Object from Jizz
	 */
	@Deprecated
	private Object defaultValue = null;
	/**
	 * if this is true the field is static and can be accessed throught the class name -> no object needed.
	 */
	private boolean isStatic = false;
	
	public Field(String name, String type, Object defaultValue) {
		super();
		this.name = name;
		this.type = type;
		this.defaultValue = defaultValue;
	}
	public Field(String name, String type, boolean isStatic) {
		super();
		this.name = name;
		this.type = type;
		this.isStatic = isStatic;
	}
	public Field(String name, String type, Object defaultValue, boolean isStatic) {
		super();
		this.name = name;
		this.type = type;
		this.defaultValue = defaultValue;
		this.isStatic = isStatic;
	}
	public Field(String name, String type, AccessModifier mod, boolean isStatic) {
		super();
		this.name = name;
		this.type = type;
		this.mod = mod;
		this.isStatic = isStatic;
	}
	public Field(String name, String type, AccessModifier mod, Object defaultValue) {
		super();
		this.name = name;
		this.type = type;
		this.mod = mod;
		this.defaultValue = defaultValue;
	}
	public Field(String name, String type, AccessModifier mod, Object defaultValue, boolean isStatic) {
		super();
		this.name = name;
		this.type = type;
		this.mod = mod;
		this.defaultValue = defaultValue;
		this.isStatic = isStatic;
	}
	public Field(String name, String type, AccessModifier mod) {
		super();
		this.name = name;
		this.type = type;
		this.mod = mod;
	}
	public Field(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	/**
	 * {@link Field#name} 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * {@link Field#name} 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * {@link Field#type} 
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * {@link Field#type} 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * {@link Field#mod} 
	 * @return the mod
	 */
	public AccessModifier getMod() {
		return mod;
	}
	/**
	 * {@link Field#mod} 
	 * @param mod the mod to set
	 */
	public void setMod(AccessModifier mod) {
		this.mod = mod;
	}
	/**
	 * {@link Field#defaultValue} 
	 * @return the defaultValue
	 */
	public Object getDefaultValue() {
		return defaultValue;
	}
	/**
	 * {@link Field#defaultValue} 
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(Object defaultValue) {
		this.defaultValue = defaultValue;
	}
	/**
	 * {@link Field#isStatic} 
	 * @return the isStatic
	 */
	public boolean isStatic() {
		return isStatic;
	}
	/**
	 * {@link Field#isStatic} 
	 * @param isStatic the isStatic to set
	 */
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}
	
}
