package com.pragma.powerup.plazamicroservice.domain.spi;

import com.pragma.powerup.plazamicroservice.domain.model.Order;

public interface IOrderPersistencePort {
    void createOrder(Order order);
}
