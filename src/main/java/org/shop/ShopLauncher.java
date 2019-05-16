package org.shop;


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
        System.out.println(ctx.getBean(ProposalRepository.class).getProposal(1L));
    }
}
