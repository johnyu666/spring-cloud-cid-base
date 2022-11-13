package cn.johnyu.order.entity;

import cn.johnyu.commons.dto.AccountDto;
import cn.johnyu.commons.dto.ProductDto;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Order {
    private Integer id;
    private int amount;
    private ProductDto product;
    private AccountDto account;

}
