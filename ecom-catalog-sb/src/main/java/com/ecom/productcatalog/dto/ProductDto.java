package com.ecom.productcatalog.dto;

import com.ecom.productcatalog.exception.DataValidationException;
import com.ecom.productcatalog.utils.Missing;
import lombok.Data;

@Data
public class ProductDto {

    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private Integer categoryId;

    public void validate() throws DataValidationException {
        if (Missing.string(name)) {
            throw new DataValidationException("name not found", "Check the required field name");
        }

        if (Missing.string((description))) {
            throw new DataValidationException("description is missing", "Check the required field description");
        }

        if (Missing.string((imageUrl))) {
            throw new DataValidationException("imageUrl is missing", "Check the required field imageUrl");
        }
    }
}
