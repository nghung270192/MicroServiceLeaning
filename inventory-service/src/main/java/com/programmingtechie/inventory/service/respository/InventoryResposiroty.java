package com.programmingtechie.inventory.service.respository;


import com.programmingtechie.inventory.service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryResposiroty extends JpaRepository<Inventory, Long> {


    List<Inventory> findBySkuCodeIn(List<String> skuCodes);
}
