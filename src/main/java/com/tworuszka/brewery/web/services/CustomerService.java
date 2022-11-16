package com.tworuszka.brewery.web.services;

import com.tworuszka.brewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Michał Tworuszka
 * @project brewery
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
