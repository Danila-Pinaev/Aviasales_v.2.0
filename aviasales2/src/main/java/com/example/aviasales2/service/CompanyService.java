package com.example.aviasales2.service;

import com.example.aviasales2.entity.Company;

import java.util.List;

public interface CompanyService {
    Company save(Company company);

    Company findByCompanyId(long id);

    String delete(long id);

    Company findByCompanyName(String name);

    List<Company> findByRating(int rating);

    List<Company> findAll();


}