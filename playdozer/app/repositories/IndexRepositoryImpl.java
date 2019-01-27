package repositories;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.Person;

public class IndexRepositoryImpl implements IndexRepository {
	@Override
	public Person findPersonById(Long id) {
		return Ebean.find(Person.class).where().eq("id", id).findUnique();
	}
	
	@Override
	public List<Person> findPersonAll() {
		return Ebean.find(Person.class).findList();
	}

	@Override
	public void insertPerson(Person person) {
		try {
			Ebean.beginTransaction();
			Ebean.insert(person);
			Ebean.commitTransaction();
		} catch (Exception e) {
			Ebean.rollbackTransaction();
		} finally {
			Ebean.endTransaction();
		}
	}

	@Override
	public void deletePerson(Person person) {
		try {
			Ebean.beginTransaction();
			Ebean.delete(person);
			Ebean.commitTransaction();
		} catch (Exception e) {
			Ebean.rollbackTransaction();
		} finally {
			Ebean.endTransaction();
		}
	}

}
