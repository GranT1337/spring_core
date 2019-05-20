package org.shop;

import org.shop.annotations.InjectRandomInt;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The main Data Initializer util class.
 */
public class DataInitializer {

    /** The seller initializer. */
    @Autowired
    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */
    @Autowired
    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */
    @Autowired
    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */
    @Autowired
    private UserInitializer userInitializer;

    @InjectRandomInt(min = 2, max = 7)
    private int randomValue;

    /**
     * Inits the data.
     */

    public void initData() {
        System.out.println("Random number: " + randomValue);
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }
}
