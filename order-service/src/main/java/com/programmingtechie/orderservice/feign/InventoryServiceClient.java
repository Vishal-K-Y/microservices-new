package com.programmingtechie.orderservice.feign;

import com.programmingtechie.orderservice.dto.InventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@FeignClient(name="inventory-service", url="http://localhost:7779")
@FeignClient(name="inventory-service") // for load balanced
public interface InventoryServiceClient {

    @GetMapping("/api/inventory")
    List<InventoryResponse> isInStock(@RequestParam List<String> skuCode);
}
