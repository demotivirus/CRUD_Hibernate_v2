package util;

import factory.*;
import org.hibernate.SessionFactory;

import java.sql.Connection;

public class DBHelper {
    private static DBHelper instatnce;

    public static DBHelper getInstatnce(){
        if (instatnce == null)
            return instatnce = new DBHelper();
        return instatnce;
    }

    private DBHelper(){}

    public Connection getConnection(){
        ConnectionFactory factory = new JDBCConnFactory();
        JDBC jdbc = (JDBC) factory.getConnect();
        return jdbc.getConnection();
    }

    public SessionFactory getConfiguration(){
        ConnectionFactory factory = new HibernateConnFactory();
        Hibernate hibernate = (Hibernate) factory.getConnect();
        return hibernate.getConfiguration();
    }
}
