package ws.api.commons.security;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

@Configuration
public class RoleBasedJwtAuthenticationConverter implements Converter<Jwt, AbstractAuthenticationToken>,
		InitializingBean {

	@Autowired
	private JwtAuthenticationConverter jwtAuthenticationConverter;

	@Autowired
	private JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter;

	private static final String AUTHORITY_CLAIM_NAME = "ROLES";
	private static final String AUTHORITY_PREFIX = "ROLES_";

	private static volatile RoleBasedJwtAuthenticationConverter singleton;

	@Override
	public AbstractAuthenticationToken convert(Jwt source) {
		return jwtAuthenticationConverter.convert(source);
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		jwtGrantedAuthoritiesConverter.setAuthoritiesClaimName(AUTHORITY_CLAIM_NAME);
		jwtGrantedAuthoritiesConverter.setAuthorityPrefix(AUTHORITY_PREFIX);

		jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwtGrantedAuthoritiesConverter);

	}

	public static RoleBasedJwtAuthenticationConverter singleton() {
		if (singleton == null) {
			synchronized (RoleBasedJwtAuthenticationConverter.class) {
				if (singleton == null)
					singleton = new RoleBasedJwtAuthenticationConverter();
			}
		}
		return singleton;
	}

	@Bean
	@Scope("singleton")
	public RoleBasedJwtAuthenticationConverter jwtAuthenticationConverterImpl() {
		return singleton();
	}
}
