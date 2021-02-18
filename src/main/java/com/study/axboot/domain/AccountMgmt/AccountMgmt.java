package com.study.axboot.domain.AccountMgmt;

import com.chequer.axboot.core.annotations.ColumnPosition;
import com.study.axboot.domain.SimpleJpaModel;
import lombok.*;
import org.apache.ibatis.type.Alias;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.chequer.axboot.core.annotations.Comment;
import javax.persistence.*;


@Setter
@Getter
@DynamicInsert
@DynamicUpdate
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "account_management")
@Comment(value = "")
@Alias("accountMgmt")
public class AccountMgmt extends SimpleJpaModel<String> {

	@Id
	@Column(name = "USER_ID", length = 20, nullable = false)
	@Comment(value = "")
	private String userId;

	@Column(name = "USER_NM", length = 20, nullable = false)
	@Comment(value = "")
	private String userNm;

	@Column(name = "PHONE_NO", length = 30)
	@Comment(value = "")
	private String phoneNo;

	@Column(name = "EMPLOYEE_NO", precision = 10, nullable = false)
	@Comment(value = "")
	private Integer employeeNo;

	@Column(name = "DEPT_NM", length = 20, nullable = false)
	@Comment(value = "")
	private String deptNm;

	@Column(name = "DEPT_NO", length = 10)
	@Comment(value = "")
	private String deptNo;

	@Column(name = "EMAIL_ADDR", length = 30, nullable = false)
	@Comment(value = "")
	private String emailAddr;


    @Override
    public String getId() {
        return userId;
    }
}