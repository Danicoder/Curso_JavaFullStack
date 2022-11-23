package com.example.ejemplospring1.products.Proyecciones;

import org.springframework.beans.factory.annotation.Value;

public interface ProductWithOutCategory {
    int getId();
    String getReference();
    String getName();
    double getPrice();


    /*Ejemplo de campos nuevos calculados */
    @Value("#target.category.id")
    int getIdCategory();

    @Value("#{target.reference + '-' + target.name}")//hace que salgan los datos indicados
    String getHola();

    @Value("#{target.price * 1.21}") //muestra el precio con el IVA
    double getPriceWithTax();

    /*También se hace implementando el método, mé obliga a tener en esta clase tener los método creados*/
    default String getProductCode(){
        return getReference() + "-" + getName();
    }

    
}
