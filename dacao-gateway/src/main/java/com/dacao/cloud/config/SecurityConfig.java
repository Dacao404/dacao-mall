package com.dacao.cloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

/**
 * @program: dacao-mall
 * @description: 安全配置中心
 * @author: Da-cao
 * @create: 2024-06-20 17:47
 **/


@ConfigurationProperties(prefix = "security")
@Configuration(proxyBeanMethods = false)
@EnableWebFluxSecurity
@Slf4j
public class SecurityConfig {
}
