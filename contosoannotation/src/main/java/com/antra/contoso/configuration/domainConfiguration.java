package com.antra.contoso.configuration;

import java.sql.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
//@ComponentScan({"com.antra.contoso.configuration"})
//@PropertySource(value= {"classpath:application.properties"})
public class domainConfiguration 
{
	/*@Bean(name="dateBean")
	public Date newDate() {
		return new Date(2014,5,5);
	}*/

}
