package com.byGaurav.componentAnnotationUsingJavaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.byGaurav.componentAnnotationUsingJavaConfig")
public class Config {

}
