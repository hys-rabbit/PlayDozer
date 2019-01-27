package services;

import javax.inject.Inject;

import org.dozer.Mapper;

import dtos.IndexDto;
import models.Person;
import repositories.IndexRepository;

public class IndexServiceImpl implements IndexService {
	@Inject
	private Mapper mapper;
	@Inject
	private IndexRepository repository;
	@Override
	public void init(IndexDto dto) {
		dto.personList = repository.findPersonAll();
	}
	@Override
	public void regist(IndexDto dto) {
		Person person = mapper.map(dto, Person.class);
		repository.insertPerson(person);
		dto.personList = repository.findPersonAll();
	}
	@Override
	public void delete(IndexDto dto) {
		Person person = repository.findPersonById(dto.id);
		repository.deletePerson(person);
		dto.personList = repository.findPersonAll();
	}

}
