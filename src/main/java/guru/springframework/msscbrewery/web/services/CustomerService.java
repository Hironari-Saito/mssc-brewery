package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
  CustomerDto getCustomerById(UUID customerId);

  CustomerDto saveNewCustomer(CustomerDto customerDto);

  void updateCustomer(CustomerDto customerDto);

  void deleteCustomer(UUID customerId);
}
