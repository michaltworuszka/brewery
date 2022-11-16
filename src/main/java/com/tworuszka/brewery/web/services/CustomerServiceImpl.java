package com.tworuszka.brewery.web.services;

import com.tworuszka.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Michał Tworuszka
 * @project brewery
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Mike_Twor")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().
                id(customerDto.getId()).
                name("Mila")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("updated Customer with id {}", customerId);
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleted Customer with id {}", customerId);
    }
}
