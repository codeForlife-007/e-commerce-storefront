package com.ecom.productcatalog.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@EqualsAndHashCode(callSuper = true)
public class ProductCatalogException extends Exception {

    private final String errorDescription;

    public ProductCatalogException(String message) {
        super(message);
        errorDescription = "something went wrong";
    }

    public ProductCatalogException(String message, String errorDescription) {
        super(message);
        this.errorDescription = errorDescription;
    }
}
