package com.ecom.productcatalog.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
public class DataValidationException extends ProductCatalogException {
    private final String errorDescription;

    public DataValidationException(String message) {
        super(message);
        errorDescription = "something went wrong";
    }

    public DataValidationException(String message, String errorDescription) {
        super(message);
        this.errorDescription = errorDescription;
    }
}
