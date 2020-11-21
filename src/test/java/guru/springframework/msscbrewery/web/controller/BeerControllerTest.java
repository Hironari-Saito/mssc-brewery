package guru.springframework.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.services.BeerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.mockito.Mockito.reset;

class BeerControllerTest {

  @MockBean
  BeerService beerService;

  @Autowired
  MockMvc mockMvc;

  @Autowired
  ObjectMapper objectMapper;

  @Captor
  ArgumentCaptor<UUID> uuidArgumentCaptor;

  BeerDto validBeer;

  @BeforeEach
  void setUp() {
    validBeer = BeerDto.builder()
        .beerName("Beer1")
//        .beerStyle(BeerStyleEnum.PALE_ALE)
//        .price(new BigDecimal("12.99"))
//        .quantityOnHand(4)
//        .upc(DefaultBreweryLoader.BEER_1_UPC)
        .build();
  }

  @AfterEach
  void tearDown() {
    reset(beerService);
  }

  @Test
  void getBeer() {
  }

  @Test
  void handlePost() {
  }

  @Test
  void handleUpdate() {
  }
}