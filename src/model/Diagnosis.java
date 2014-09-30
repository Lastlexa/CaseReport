package model;

/**
 * @author Alex
 * @version 1.0
 * @created 27-Sep-2013 2:27:47 PM
 */
public class Diagnosis {

	private int id;
	private int code;
	private String name;

	public Diagnosis(){

	}

	/**
	 * 
	 * @param id
	 * @param code
	 * @param name
	 */
	public Diagnosis(int id, int code, String name){
		this.id = id;
		this.code = code;
		this.name = name;
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Diagnosis(int id, String name){
		this(id, 0, name);
	}

	public int getId(){
		return id;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		id = newVal;
	}

	public int getCode(){
		return code;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCode(int newVal){
		code = newVal;
	}

	public String getName(){
		return name;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		name = newVal;
	}
	public String toString(){
		return name;		
	}
	
}
