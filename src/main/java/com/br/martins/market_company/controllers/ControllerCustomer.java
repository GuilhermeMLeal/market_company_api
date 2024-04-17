package com.br.martins.market_company.controllers;

import com.br.martins.market_company.dto.CustomersDTO;
import com.br.martins.market_company.models.CustomersEntity;
import com.br.martins.market_company.repository.RepositoryCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class ControllerCustomer {

    @Autowired
    private RepositoryCustomers custom_repo;

    @GetMapping
    public List<CustomersEntity> get_all_customers(){
        return custom_repo.findAll();
    }

    @GetMapping("/{id}")
    public CustomersEntity get_a_customer(@PathVariable int id){
        Optional<CustomersEntity> optionalCustomer = custom_repo.findById(id);
        return optionalCustomer.orElseThrow(()->new ResponseStatusException
                (HttpStatus.NOT_FOUND, "Customer not found"));
    }

    @PostMapping()
    public CustomersEntity register_a_customer(@RequestBody CustomersDTO dto_customer){
        CustomersEntity customer = new CustomersEntity(dto_customer);
        return custom_repo.save(customer);
    }

    @DeleteMapping("<{id}>")
    public String delete_a_customer(@PathVariable int id){
        CustomersEntity customer = get_a_customer(id);
        if (customer!=null){
            custom_repo.delete(customer);
            return  "User deleted with success" ;
        }
        else return "User was'nt found";

    }

    @PutMapping
    public CustomersEntity updateCustomer(@PathVariable int id, @RequestBody CustomersDTO dtoCustomer){
        CustomersEntity existingCustomer = custom_repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found"));

        existingCustomer.setNameUser(dtoCustomer.nameUser());
        existingCustomer.setAgeUser(dtoCustomer.ageUser());
        existingCustomer.setEmailUser(dtoCustomer.emailUser());
        existingCustomer.setPasswordUser(dtoCustomer.passwordUser());

        custom_repo.save(existingCustomer);
        return existingCustomer;
    }

}
