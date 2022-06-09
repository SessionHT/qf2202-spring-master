package com.cos.s1.factory;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author: COS
 * @time: 2022/6/2 14:43
 * @description:
 */
public class MyConnectionFactory implements FactoryBean<Connection> {
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/2 14:44
     * @description: 实例返回对象实例的方法
     */
    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_shopping?useUnicode=true&characterEncoding=utf8",
                "cos", "123456");
        return con;
    }
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/2 14:44
     * @description: 返回实例的类型
     */
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/2 14:43
     * @description: 是否为单例模式
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
