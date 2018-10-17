
package com.zxing.security.rbac.repository;

import org.springframework.stereotype.Repository;

import com.zxing.security.rbac.domain.Admin;

/**
 * @author zxing
 *
 */
@Repository
public interface AdminRepository extends ZxingRepository<Admin> {

	Admin findByUsername(String username);

}
