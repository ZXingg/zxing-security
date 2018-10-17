
package com.zxing.security.rbac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author zxing
 *
 */
@NoRepositoryBean
public interface ZxingRepository<T> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

}
