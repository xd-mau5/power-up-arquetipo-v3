package com.pragma.powerup.plazamicroservice.domain.api;

import com.pragma.powerup.plazamicroservice.domain.model.Restaurant;

public interface IRestaurantServicePort {
    void createRestaurant(Restaurant restaurant);
}
