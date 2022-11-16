package com.tworuszka.brewery.web.services.v2;



import com.tworuszka.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author Michał Tworuszka
 * @project brewery
 */
public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
