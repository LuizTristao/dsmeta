package com.devsuperior.backend.control;
import java.util.List;
import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.serv.SalesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SalesService service;
    
    @GetMapping
    public List<Sale> findSales(){
        return service.findSales();
    }
}
