package cn.johnyu.commons.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductDto {
    private Integer id;
    private String name;
    private int stock;
    private String extra;
}
