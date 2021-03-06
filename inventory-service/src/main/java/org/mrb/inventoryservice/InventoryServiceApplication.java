package org.mrb.inventoryservice;

import org.mrb.inventoryservice.entities.Product;
import org.mrb.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.SQLOutput;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Product.class);
        return args -> {
            productRepository.save(new Product(null,"Laptop",8000));
            productRepository.save(new Product(null,"Smartphone",1200));
            productRepository.save(new Product(null,"Playstation5",1570));
            productRepository.save(new Product(null,"Smart TV",1900));
            productRepository.save(new Product(null,"Dishwasher",1099));
            productRepository.save(new Product(null,"Toaster",170));
            productRepository.save(new Product(null,"Kettle",300));
            productRepository.save(new Product(null,"Microwave",699));
            productRepository.save(new Product(null,"Squeezer",150));
            productRepository.save(new Product(null,"Freezer",2999));
            productRepository.save(new Product(null,"Iron",199));
            productRepository.findAll().forEach(product -> {
                System.out.println(product.toString());
            });

        };
    }

}
