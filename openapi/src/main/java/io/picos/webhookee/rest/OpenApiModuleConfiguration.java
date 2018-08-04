package io.picos.webhookee.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"io.picos.webhookee.rest.controller", "io.picos.webhookee.rest.support.impl"})
public class OpenApiModuleConfiguration {

}
