package com.lhp.accounts.Bo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-study",fallback = FeignServiceFallback.class)
public interface FeignService {

    @RequestMapping(value = "/study/hello",method = RequestMethod.POST)
    public String hello(@RequestParam("name") String name);

}
