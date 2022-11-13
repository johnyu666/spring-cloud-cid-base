package cn.johnyu.order.mapper;

import cn.johnyu.order.po.OrderPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderDao {
    @Select("select id,product_id as pid ,user_id as aid,pay_amount as amount from orders where id= #{oid}")
    OrderPo loadOrder(@Param("oid") int oid);
}
