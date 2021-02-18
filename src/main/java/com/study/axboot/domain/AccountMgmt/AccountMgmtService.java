package com.study.axboot.domain.AccountMgmt;

import org.springframework.stereotype.Service;
import com.study.axboot.domain.BaseService;
import javax.inject.Inject;
import com.chequer.axboot.core.parameter.RequestParams;
import java.util.List;

@Service
public class AccountMgmtService extends BaseService<AccountMgmt, String> {
    private AccountMgmtRepository accountMgmtRepository;

    @Inject
    public AccountMgmtService(AccountMgmtRepository accountMgmtRepository) {
        super(accountMgmtRepository);
        this.accountMgmtRepository = accountMgmtRepository;
    }

    public List<AccountMgmt> gets(RequestParams<AccountMgmt> requestParams) {
        return findAll();
    }
}