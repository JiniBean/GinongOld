package com.ginong.context;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisContext {

	private static SqlSessionFactory factory;
	
	static {
		try {
			System.out.println("Mybatis 초기화");
			String resource = "mybatis-config.xml";
			 InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getFactory() {
		return factory;
	}

	public static void setFactory(SqlSessionFactory factory) {
		MybatisContext.factory = factory;
	}
	
	
}
