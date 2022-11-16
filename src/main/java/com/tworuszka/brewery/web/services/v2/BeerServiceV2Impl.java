package com.tworuszka.brewery.web.services.v2;

import com.tworuszka.brewery.web.model.BeerDto;
import com.tworuszka.brewery.web.model.v2.BeerDtoV2;
import com.tworuszka.brewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Michał Tworuszka
 * @project brewery
 */

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(beerId)
                .beerName("Desperados")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Garage")
                .beerStyle(BeerStyleEnum.IPA)
                .upc(123456L)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //todo impl of update method
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting beer...");
    }
}
