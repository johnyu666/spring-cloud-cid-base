package cn.johnyu.commons.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AccountDto {
    private Integer id;
    private String name;
    private int balance;
    private String extra;
}
