package modules;

//import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.google.inject.AbstractModule;

public class MappingModule extends AbstractModule {

	@Override
	protected void configure() {
		/* dozerBeanMapping.xmlによるクラス定義の方法がわからず断念 */
//		bind(Mapper.class).toInstance(DozerBeanMapperSingletonWrapper.getInstance());
		
		bind(Mapper.class).to(DozerBeanMapper.class);
	}

}
