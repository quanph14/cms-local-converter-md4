package com.codegym.service.customer;

import com.codegym.exception.DuplicateEmailException;
import com.codegym.model.Customer;
import com.codegym.model.Province;
import com.codegym.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable) throws Exception;

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
    public Optional<Customer> findById(Long id);
    public void save(Customer customer) throws DuplicateEmailException;
    public void remove(Long id);
    public Optional<Customer> findOne(Long id) throws Exception;

}
