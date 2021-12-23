package br.com.cakes.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product extends BaseEntity {
    private String Description;
    private String Title;
    private String ImageUrl;
    private ProductCategory ProductCategory;
    private Double Price;
    private boolean Active;
}
