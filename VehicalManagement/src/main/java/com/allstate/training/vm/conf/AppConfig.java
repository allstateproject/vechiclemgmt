package com.allstate.training.vm.conf;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.allstate.training.vm.entities.Booking;
import com.allstate.training.vm.entities.Buses;
import com.allstate.training.vm.entities.Employee;
import com.allstate.training.vm.entities.Passenger;
import com.allstate.training.vm.entities.Route;
import com.allstate.training.vm.entities.RouteDetails;
import com.allstate.training.vm.entities.Schedule;
import com.allstate.training.vm.entities.Users;

//import com.allstate.training.vm.entities.Passenger;



@Configuration
@ComponentScan(basePackages="com.allstate.training.vm")
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/").setCachePeriod(31556926);
       // registry.addResourceHandler("/img/**").addResourceLocations("/resources/imgages/").setCachePeriod(31556926);
       // registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/").setCachePeriod(31556926);
    }
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=
				new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/VMS");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		return dataSource;
	}
	
	
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		Properties props=new Properties();
		props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		props.put(Environment.HBM2DDL_AUTO, "update");
		props.put(Environment.SHOW_SQL, "true");
		props.put(Environment.FORMAT_SQL, "true");
	/*	props.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
		props.put(Environment.CACHE_REGION_FACTORY, 
				"org.hibernate.cache.ehcache.EhCacheRegionFactory");
		*/
		sessionFactory.setHibernateProperties(props);
		sessionFactory.setPackagesToScan(new String[] {"com.allstate.training.vm.entities"});
	  	sessionFactory.setAnnotatedClasses(Passenger.class);
		
		sessionFactory.setAnnotatedClasses(Buses.class);
		sessionFactory.setAnnotatedClasses(Employee.class);
		sessionFactory.setAnnotatedClasses(Booking.class);
		sessionFactory.setAnnotatedClasses(Route.class);
		sessionFactory.setAnnotatedClasses(RouteDetails.class);
		sessionFactory.setAnnotatedClasses(Users.class);
		sessionFactory.setAnnotatedClasses(Schedule.class);
		return sessionFactory;
	}

}
