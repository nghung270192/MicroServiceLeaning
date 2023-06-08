package com.programmingtechie.inventory.service.service;

import com.programmingtechie.inventory.service.dto.InventoryResponse;
import com.programmingtechie.inventory.service.respository.InventoryResposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryResposiroty inventoryResposiroty;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCodes) {
        return inventoryResposiroty.findBySkuCodeIn(skuCodes).stream()
                .map(inventory ->
                        InventoryResponse.builder()
                                .skuCode(inventory.getSkuCode())
                                .isInStock(inventory.getQuantity() > 0)
                                .build()
                ).toList();

    }
}
