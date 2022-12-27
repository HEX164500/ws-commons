package ws.api.commons.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

@Configuration
public class JwtGrantedAuthoritiesConverterBean {

	@Bean
	@Scope("singleton")
	public JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter() {
		return new JwtGrantedAuthoritiesConverter();
	}
}
