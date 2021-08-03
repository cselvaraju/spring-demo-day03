package com.selva.scopedemo;

public interface BookDBService {
	public BookDao getBookDao();
	public String getBookApiUrl();
}
