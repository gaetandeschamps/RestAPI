package entities;
/**
 * This class declares the specificities of the object "Persons". 
 * Each person is composed with an id and a name.
 * The getter and setters have been generated to get the id or the name of a person and to set these caracteristic
 * @author gaetandeschamps
 */
public class Persons {
	private int id;
	private String name;
	
	public Persons() {}
		
	public Persons(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
		
}
