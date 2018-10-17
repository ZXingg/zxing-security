package com.zxing.security.rbac.repository.spec;

import com.zxing.security.rbac.domain.Admin;
import com.zxing.security.rbac.dto.AdminCondition;
import com.zxing.security.rbac.repository.support.ZxingSpecification;
import com.zxing.security.rbac.repository.support.QueryWraper;

/**
 * @author zxing
 *
 */
public class AdminSpec extends ZxingSpecification<Admin, AdminCondition> {

	public AdminSpec(AdminCondition condition) {
		super(condition);
	}

	@Override
	protected void addCondition(QueryWraper<Admin> queryWraper) {
		addLikeCondition(queryWraper, "username");
	}

}
