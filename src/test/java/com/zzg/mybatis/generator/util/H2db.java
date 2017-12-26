package com.zzg.mybatis.generator.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class H2db {

    public static void main(String[] a)
    {
        try {
            Class.forName("org.h2.Driver");
//        Connection conn = DriverManager.
//                getConnection("jdbc:h2:D:\\work\\git\\sbgrouptool\\test2", "sa", "123456");
//        jdbc:h2:tcp://dbserv:8084/~/sample
            PrintWriter printWriter = new PrintWriter(System.out);
            DriverManager.setLogWriter(printWriter);
            Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost:8082/~/p", "root", "123456");
            conn.close();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}
