package org.daijie.shiro.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.daijie.shiro.configure.ClusterShiroConfigure;
import org.springframework.context.annotation.Import;


@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ClusterShiroConfigure.class)
public @interface ClusterShiroAutoConfiguration {

}
