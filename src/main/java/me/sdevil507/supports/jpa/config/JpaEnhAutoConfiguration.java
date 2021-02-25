package me.sdevil507.supports.jpa.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * jpa增强场景启动器自动发现配置
 *
 * @author sdevil507
 * created on 2021-02-24
 */
@Configuration
public class JpaEnhAutoConfiguration {

    /**
     * 启用queryDsl能力
     *
     * @param entityManager entityManager
     * @return JPAQueryFactory
     */
    @Bean(name = "jpaQueryFactory")
    public JPAQueryFactory jpaQuery(EntityManager entityManager) {
        return new JPAQueryFactory(entityManager);
    }

}
