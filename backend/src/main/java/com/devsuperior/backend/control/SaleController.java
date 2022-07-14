package com.devsuperior.backend.control;
import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.serv.SalesService;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SalesService service;
    
    @GetMapping
    public Page<Sale> findSales(
        @RequestParam(value = "minDate", defaultValue = "") String minDate,
        @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
        Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }
}
