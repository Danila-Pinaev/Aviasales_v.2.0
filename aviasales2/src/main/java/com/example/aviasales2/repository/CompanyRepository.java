package com.example.aviasales2.repository;

import com.example.aviasales2.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
    Company findByCompanyId(long id);

    void delete(Company company);

    Company findByCompanyName(String name);

    List<Company> findByRating(int rating);

    List<Company> findAll();



}