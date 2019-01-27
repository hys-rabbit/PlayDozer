package modules;

import com.google.inject.AbstractModule;

import repositories.IndexRepository;
import repositories.IndexRepositoryImpl;
import services.IndexService;
import services.IndexServiceImpl;

public class IndexModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IndexService.class).to(IndexServiceImpl.class);
		bind(IndexRepository.class).to(IndexRepositoryImpl.class);
	}

}
