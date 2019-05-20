package org.shop;


import org.shop.api.ProductService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.shop.config.RootConfig;
import org.shop.repository.ProposalRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);

        ctx.getBean(ProductService.class).getProducts().forEach(System.out::println);

        ctx.getBean(SellerService.class).getSellers().forEach(System.out::println);

        ctx.getBean(UserService.class).getUsers().forEach(System.out::println);


    }
}
