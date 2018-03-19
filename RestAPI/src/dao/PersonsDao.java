package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Persons;
/**
 * The PersonsDao is here a "simulation" of a database.
 * It constitues the instance of the PersonsService/Persons classes.
 * @author gaetandeschamps
 *
 */
public enum PersonsDao{
	instance; 
	private Map<Integer, Persons> personsList = new HashMap<>();
	/**
	 * Listing of the persons that are supposed to be "people".
	 */
	private PersonsDao() {
		
		Persons person1 = new Persons(1,"John");
		person1.setId(1);
		person1.setName("John");
		personsList.put(1, person1);
		
		Persons person2 = new Persons(2, "Michael");
		person2.setId(2);
		person2.setName("Michael");
		personsList.put(2, person2);
		
		Persons person3 = new Persons(3, "Christian");
		person3.setId(3);
		person3.setName("Christian");
		personsList.put(3, person3);
		
		Persons person4 = new Persons(4, "Anthony");
		person4.setId(4);
		person4.setName("Anthony");
		personsList.put(4, person4);
		
	}
	/**
	 * This method is here to get the list of the persons.
	 * @return the list of the persons listed in the instance.
	 */
	public Map<Integer, Persons> getModel() {
		return personsList;
	}
	/**
	 * Method that aims to add a new person to the DAO.
	 * @param person ; the object that we want to create.
	 * @return the person created by the method (placed in parameter)
	 */
	public Persons addPerson(Persons person) {
		Integer id = null;
		person.setId(id);
		personsList.put(id, person);
		return person;
	}
	
}
