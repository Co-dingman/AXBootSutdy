package com.study.axboot.controllers;

import com.chequer.axboot.core.api.response.Responses;
import com.chequer.axboot.core.controllers.BaseController;
import com.chequer.axboot.core.parameter.RequestParams;
import org.springframework.stereotype.Controller;
import com.chequer.axboot.core.api.response.ApiResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.study.axboot.domain.AccountMgmt.AccountMgmt;
import com.study.axboot.domain.AccountMgmt.AccountMgmtService;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping(value = "/api/v1/accountmgmt")
public class AccountMgmtController extends BaseController {

    @Inject
    private AccountMgmtService accountMgmtService;

    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Responses.ListResponse list(RequestParams<AccountMgmt> requestParams) {
        List<AccountMgmt> list = accountMgmtService.gets(requestParams);
        return Responses.ListResponse.of(list);
    }

    @RequestMapping(method = {RequestMethod.PUT}, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody List<AccountMgmt> request) {
        accountMgmtService.save(request);
        return ok();
    }
}