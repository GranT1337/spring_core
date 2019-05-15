package org.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/sequence.properties")
@Import({FactoryConfig.class, InitializesConfig.class, RepositoryConfig.class, ServiceConfig.class})
public class RootConfig {

}
