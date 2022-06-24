package ma.atos.agency.services;

import ma.atos.agency.dto.AccountDto;

import ma.atos.agency.dto.AgencyDto;
import ma.atos.agency.entities.Account;
import ma.atos.agency.exceptions.AgencyNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

public interface IAccount {
    List<AccountDto> getAll();
    Page<Account> pagination(Pageable pageable);
    AccountDto newAccount(AccountDto accountDto);
    AccountDto getAccount(Long id) throws AccountNotFoundException;
    AccountDto updateAccount(AccountDto newAccountDto) throws AccountNotFoundException;
    void deleteAccount(Long id) throws AccountNotFoundException;
    AccountDto findById(Long id) throws AccountNotFoundException;


}
