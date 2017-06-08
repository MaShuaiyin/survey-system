package com.msy.test.datasource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by MaShuaiyin on 2017/6/3.
 */
public class IOCTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-context.xml");

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = ioc.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void createTable() {

    }
}
