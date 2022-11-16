package com.tworuszka.brewery.web.services;

import com.tworuszka.brewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Michał Tworuszka
 * @project brewery
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
