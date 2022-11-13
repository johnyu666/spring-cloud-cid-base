package cn.johnyu.account.mapper;

import cn.johnyu.commons.dto.AccountDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountMapper {
    @Select("select * from accounts where id=#{aid}")
    AccountDto loadAccount(@Param("aid") int aid);
    @Update("update accounts set balance=balance - #{balance} where id =#{aid}")
    int reduceBalance(@Param("aid") int aid,@Param("balance") int balance);
}
