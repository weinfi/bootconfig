package com.leo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
@MapperScan(value = "com.leo.mapper")
@EnableCaching
public class BootconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootconfigApplication.class, args);
	}

/*	private static class MyViewResolver implements ViewResolver{
		@Nullable
		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}

	public ViewResolver myView(){
		return new MyViewResolver();
	}*/

}
