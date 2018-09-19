package io.picos.webhookee.apidoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan({"io.picos.webhookee.rest.controller", "io.picos.webhookee.apidoc.support.mock"})
@Import({Swagger2Configuration.class})
public class ApiDocApplication extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiDocApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{ApiDocApplication.class}, args);
    }

}
