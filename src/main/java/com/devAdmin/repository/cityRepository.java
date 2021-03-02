package com.devAdmin.repository;


import org.springframework.data.repository.CrudRepository;

import com.doj.restapi.bean.Account;

public interface cityRepository extends CrudRepository<Account, Long> {

}
