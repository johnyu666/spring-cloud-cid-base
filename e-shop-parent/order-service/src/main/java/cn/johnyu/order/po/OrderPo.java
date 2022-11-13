package cn.johnyu.order.po;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OrderPo {
    private Integer id;
    private int pid;
    private int aid;
    private int amount;

}
