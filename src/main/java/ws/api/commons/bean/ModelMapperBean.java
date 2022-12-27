package ws.api.commons.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ModelMapperBean {

	@Bean
	@Scope("singleton")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
