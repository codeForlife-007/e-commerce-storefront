package com.ecom.productcatalog.core;

import com.ecom.productcatalog.exception.ProductCatalogException;
import lombok.Data;

@Data
public class ErrorDto {

    private String message;
    private String errorDescription;

    public static ErrorDto from(Exception e) {
        ErrorDto error = new ErrorDto();
        error.setMessage(e.getMessage());
        Throwable cause = e.getCause();
        if (cause != null) {
            error.setErrorDescription(cause.getLocalizedMessage());
        }
        return error;
    }

    public static ErrorDto from(ProductCatalogException e) {
        ErrorDto error = new ErrorDto();
        error.setMessage(e.getMessage());
        error.setErrorDescription(e.getErrorDescription());
        return error;
    }

}
