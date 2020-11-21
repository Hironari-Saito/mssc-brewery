package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto.builder().id(UUID.randomUUID())
        .name("customer name")
        .build();
  }

  @Override
  public CustomerDto saveNewCustomer(CustomerDto customerDto) {
    return CustomerDto.builder().id(UUID.randomUUID())
        .name("customer name2")
        .build();
  }

  @Override
  public void updateCustomer(CustomerDto customerDto) {
    log.debug("updating customer");
    // todo impl - would add a real impl to update customer
  }

  @Override
  public void deleteCustomer(UUID customerId) {
    log.debug("deleting customer");
    // todo impl - would add a real impl to delete customer
  }
}
