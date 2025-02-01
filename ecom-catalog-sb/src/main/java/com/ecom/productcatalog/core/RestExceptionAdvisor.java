package com.ecom.productcatalog.core;

import com.ecom.productcatalog.exception.DataValidationException;
import com.ecom.productcatalog.exception.NotFoundException;
import com.ecom.productcatalog.exception.ProductCatalogException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionAdvisor {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleException(Exception e) {
        return new ResponseEntity<>(ErrorDto.from(e), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProductCatalogException.class)
    public ResponseEntity<ErrorDto> handleException(ProductCatalogException e) {
        return new ResponseEntity<>(ErrorDto.from(e), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDto> handleException(NotFoundException e) {
        return new ResponseEntity<>(ErrorDto.from(e), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataValidationException.class)
    public ResponseEntity<ErrorDto> handleException(DataValidationException e) {
        return new ResponseEntity<>(ErrorDto.from(e), HttpStatus.BAD_REQUEST);
    }
}
