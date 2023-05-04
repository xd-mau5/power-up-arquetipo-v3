package com.pragma.powerup.plazamicroservice.domain.api;

import com.pragma.powerup.plazamicroservice.domain.model.Order;

public interface IOrderServicePort {
    void createOrder(Order order);
}
