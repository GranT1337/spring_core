package org.shop.config;

import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
public class RepositoryConfig {


    @Value("${intitialSequence}")
    private long initialSequence;

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryFactory().createUserRepository();
    }

    @Bean
    public OrderRepository orderRepository() {
        OrderMapRepository orderMapRepository = new OrderMapRepository();
        orderMapRepository.setSequence(initialSequence);
        return orderMapRepository;
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerRepository() {
        return new SellerMapRepository();
    }

    @Bean
    public ItemRepository itemRepository() {
        return new ItemMapRepository();
    }

}
