package ma.atos.agency.mappers;

import ma.atos.agency.dto.AccountDto;
import ma.atos.agency.dto.AgencyDto;
import ma.atos.agency.entities.Account;
import ma.atos.agency.entities.Agency;
import ma.atos.agency.web.dto.Request.AccountRequestDto;
import ma.atos.agency.web.dto.Request.AgencyRequestDto;
import ma.atos.agency.web.dto.Response.AccountResponseDto;
import ma.atos.agency.web.dto.Response.AgencyResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountMappers {
    @Autowired
    private ModelMapper modelMapper;

    public Account accountDtoToAccount(AccountDto accountDto) {
        Account account = modelMapper.map(accountDto, Account.class);
        return account;
    }

    public AccountDto accountToAccountDto(Account account) {
        AccountDto accountDto = modelMapper.map(account, AccountDto.class);
        return accountDto;
    }

    public AccountDto requestToAccountDto(AccountRequestDto accountRequestDto) {
        AccountDto accountDto = modelMapper.map(accountRequestDto, AccountDto.class);
        return accountDto;
    }

    public AccountResponseDto accountDtoToRespenseDto(AccountDto accountDto) {
        AccountResponseDto accountResponseDto = modelMapper.map(accountDto, AccountResponseDto.class);
        return accountResponseDto;
    }


}
