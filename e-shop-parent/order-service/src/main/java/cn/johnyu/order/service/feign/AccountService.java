package cn.johnyu.order.service.feign;

import cn.johnyu.commons.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "account-service")
public interface AccountService {
    @GetMapping("/accounts/{aid}")
    AccountDto loadAccount(@PathVariable("aid") int aid);
}
