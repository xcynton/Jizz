package com.jizz;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Is the class for a class in JIZZ. Every Class is builded by this patterns and has to include all the components
 * @author Nils Brugger
 */
public abstract class JizzClass {
	private ArrayList<String> dependencies = new ArrayList<>();
	
	 public JizzClass() {
		dependencies.add("jizz.*.*");
	}
	/**
	 * Returns the Declarations Path.<br>
	 * The Declaration Path is the path used for the Dependence.<br><i>
	 * The Declaration Path is seperated by '.'s and the all The classes which are DIRECTLY in jizz. are allways dependent. As this is definded the most important Datatypes and Classes should be definded in jizz.WHATEVER.</i>
	 * @return the declaration Path
	 */
	public abstract String getDeclaration();
	/**
	 * returns the Fields a class has.<br>
	 * @return fields of the class
	 */
	public abstract ArrayList<Field> getFields();
	/**
	 * Returns a list of all declared functions from the class and included scripts!
	 * @return the functions of this Class
	 */
	public abstract ArrayList<Function> getFunctions();

	/**
	 * Returns the Consructors of thiss class.<br>
	 * They should all be different.
	 * @return the list of all Constructors
	 */
	public abstract ArrayList<Constructor> getConstructors();
	/**
	 * Add all needed Dependencies in here
	 */
	public abstract void addDependecies();
	/**
	 * Return the SuperClass in here, or <i>null</i> in the case of <i>BasicJizzObject</i>
	 * @return the superClass
	 */
	public abstract JizzClass getSuperClass();
	
	/**
	 * A Function redirect simply is another name you can use to call an method.<br>
	 * For example there is the method setOperatingSystem(OS) and you use an redirect entry
	 * <br>
	 * In Jizz :
	 * <code>
	 * 	setOperatingSystem -> setOS<br>
	 * </code>
	 * <br>
	 * Or in Java :
	 * <code>
	 * 	map.put("setOperatingSystem","setOS")<br>
	 * </code><br>
	 * you can call it as <i>object.setOperatingSystem(null)</i> or as <i>setOS(null)</i> there is no difference.
	 * @return the Map of function redirects
	 */
	public abstract HashMap<String, String> getFunctionsRedirects();
}
