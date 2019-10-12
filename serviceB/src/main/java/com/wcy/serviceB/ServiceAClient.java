package com.wcy.serviceB;

import com.wcy.api.ServiceAInterface;
import org.springframework.cloud.netflix.feign.FeignClient;
@FeignClient("ServiceA")
public interface ServiceAClient extends ServiceAInterface {

}
