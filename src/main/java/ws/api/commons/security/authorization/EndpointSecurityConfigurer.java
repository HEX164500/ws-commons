package ws.api.commons.security.authorization;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface EndpointSecurityConfigurer {

	void secure(HttpSecurity http) throws Exception;
}
