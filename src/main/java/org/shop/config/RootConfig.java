package org.shop.config;

import org.shop.aop.MyAspect;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("sequence.properties")
@EnableAspectJAutoProxy
@Import({FactoryConfig.class, InitializesConfig.class, RepositoryConfig.class, ServiceConfig.class, AnnotationConfig.class})
public class RootConfig {

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }
}
