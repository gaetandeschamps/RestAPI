package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.PersonsDao;
import entities.Persons;
/**
 * The PersonsService aims to create the API, with an access in a @GET method, which takes the id of the person in parameter.
 * @author gaetandeschamps
 * 
 */
@Path("/persons")
public class PersonsService {
	/**
	 * This method put in an ArrayList the entierty of the persons saved in the PersonsDao.
	 * The PersonsDao is here "simulating" a database.
	 * @return
	 */
	@GET
    @Produces(MediaType.APPLICATION_JSON )
    public List<Persons> getPersons() {
        List<Persons> persons = new ArrayList<Persons>();
        persons.addAll(PersonsDao.instance.getModel().values());
        return persons;
    }
	/**
	 * This method aims to display an particular person stored in the JSON Media identified with the unique id (@Produces)
	 * The id is retrieved in the path (the URL)
	 * @param id : the identifier of the person to be able to find him easily
	 * @return the person researched, identified by the id
	 */	
	@GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Persons getPerson(@PathParam("id") int id) {
		Persons person1 = PersonsDao.instance.getModel().get(id);
		if(PersonsDao.instance.getModel().get(id) == null) {
			System.out.println("There is no person saved for this id.");
		}
		return person1;
	}
	/**
	 * This method aims to create a new person that will be entered by the user and will be stored and returned as a JSON.
	 * @param id : the id of the person that we want to create
	 * @param name : the name of the person that we want to add.
	 * @return the new person created
	 */

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Persons newPerson(Integer id, String name) {	
		Persons personX = new Persons();
		personX.setId(id);
		personX.setName(name);
		PersonsDao.instance.addPerson(personX);
		return personX;
	}
}	
