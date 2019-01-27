package services;

import dtos.IndexDto;

public interface IndexService {

	void init(IndexDto dto);
	
	void regist(IndexDto dto);
	
	void delete(IndexDto dto);
	
}
