package com.services.ms.product.product_service.model.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private BigDecimal price; //Big decimal is good for this case

    //Many-to-one relationship to a category
    @ManyToOne
    @JoinColumn(name = "category_id")
    //Category is the owner of the relationship
    private Category category; //This is from Category class
    //map
    //in my sql there is not boolean so typing:
    @Column(columnDefinition = "BIT() default: 0")
    private Boolean status;
}
