package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import guru.springframework.msscbrewery.web.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {

    return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity handlePost(@RequestBody CustomerDto customerDto) {

    CustomerDto savedDto = customerService.saveNewCustomer(customerDto);

    HttpHeaders headers = new HttpHeaders();

    headers.add("Location", "/api/v1/customer" + savedDto.getId().toString());

    return new ResponseEntity(headers, HttpStatus.CREATED);
  }

  @PutMapping("/{customerId}")
  public ResponseEntity handlePut(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {

    customerService.updateCustomer(customerDto);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("/{customerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void handleDelete(@PathVariable("customerId") UUID customerId) {
    customerService.deleteCustomer(customerId);
  }
}
