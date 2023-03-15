package com.example.Accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Accounts.model.AccountModel;

public interface AccountRepository extends CrudRepository<AccountModel, Long>{
AccountModel findByCustomerId(int customerId);
}
