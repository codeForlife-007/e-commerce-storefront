package com.ecom.productcatalog.dto;

import com.ecom.productcatalog.exception.DataValidationException;
import com.ecom.productcatalog.utils.Missing;
import lombok.Data;

@Data
public class CategoryDto {

    private String name;

    public void validate() throws DataValidationException {
        if (Missing.string(name)) {
            throw new DataValidationException("name is required");
        }
    }
}
