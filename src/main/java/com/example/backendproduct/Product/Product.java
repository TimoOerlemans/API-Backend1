package com.example.backendproduct.Product;

import com.example.backendproduct.Account.Account;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String ingredients;
    public Double price;

    @ManyToOne
    @JoinColumn(name = "accountID")
    @JsonBackReference
    private Account account;

}
