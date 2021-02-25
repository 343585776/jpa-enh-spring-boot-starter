package me.sdevil507.supports.jpa.audit;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import javax.annotation.Nonnull;
import java.util.Optional;


/**
 * 为JPA中createBy与lastModifiedBy审计设置用户ID
 *
 * @author sdevil507
 */
@Configuration
public class ShiroUserIDAuditor implements AuditorAware<String> {

    @Override
    @Nonnull
    public Optional<String> getCurrentAuditor() {
        // 返回shiro当前登录用户
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        if (null == principal) {
            return Optional.empty();
        } else {
            return Optional.of(principal.toString());
        }
    }
}
