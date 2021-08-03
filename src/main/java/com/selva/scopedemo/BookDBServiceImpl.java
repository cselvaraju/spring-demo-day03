package com.selva.scopedemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@PropertySource(value = "classpath:bookservice.properties")
public class BookDBServiceImpl implements BookDBService {

	@Autowired
	private BookDao bookDao;
	
	@Value("${bookservice.api.url}")
	private String bookApiUrl;
	
	public String getBookApiUrl() {
		return bookApiUrl;
	}

	public BookDBServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@PostConstruct
	public void initialize() {
		// Provide any additional initialization code
		// like resource allocation
		// AFTER bean instantiation
		System.out.println("======= Bean PostConstruct Method ============");
	}
	
	public BookDao getBookDao() {
		return bookDao;
	}
	
	@PreDestroy
	public void destroy() {
		// Resource cleanup code
		// just BEFORE the bean instance goes out of scope
		System.out.println("======= Bean PreDestroy Method ============");
	}
}
