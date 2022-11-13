package cn.johnyu.commons.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CommonResult<T> {
    private int code;
    private String info;
    private T content;
}
