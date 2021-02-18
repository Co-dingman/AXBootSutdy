package com.study.axboot.domain.AccountMgmt;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMgmtRepository extends AXBootJPAQueryDSLRepository<AccountMgmt, String> {
}