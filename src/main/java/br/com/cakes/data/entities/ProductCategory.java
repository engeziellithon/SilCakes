package br.com.cakes.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductCategory extends BaseEntity {
    public String Name;
    public boolean Active;
}
