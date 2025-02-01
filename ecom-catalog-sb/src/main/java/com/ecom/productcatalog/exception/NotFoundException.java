package com.ecom.productcatalog.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class NotFoundException extends ProductCatalogException {
    private final String errorDescription;

    public NotFoundException(String message) {
        super(message);
        this.errorDescription = "something went wrong";
    }

    public NotFoundException(String message, String errorDescription) {
        super(message);
        this.errorDescription = errorDescription;
    }
}
