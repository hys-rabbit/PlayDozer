package repositories;

import java.util.List;

import models.Person;

public interface IndexRepository {

	public Person findPersonById(Long id);
	
	public List<Person> findPersonAll();
	
	public void insertPerson(Person person);
	
	public void deletePerson(Person person);
	
}
