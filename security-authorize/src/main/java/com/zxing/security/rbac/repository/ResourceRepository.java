
package com.zxing.security.rbac.repository;

import org.springframework.stereotype.Repository;

import com.zxing.security.rbac.domain.Resource;

/**
 * @author zxing
 *
 */
@Repository
public interface ResourceRepository extends ZxingRepository<Resource> {

	Resource findByName(String name);

}
