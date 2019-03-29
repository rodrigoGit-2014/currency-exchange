package com.microservices.currencyexchange.controller;

import com.microservices.currencyexchange.domain.ExchangeValue;
import com.microservices.currencyexchange.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{currencyOrigin}/{currencyDestine}")
    public ExchangeValue retrieveCurrencyExchange(@PathVariable String currencyOrigin, @PathVariable String currencyDestine) {
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(currencyOrigin, currencyDestine);
        exchangeValue.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
        return exchangeValue;

    }
}
