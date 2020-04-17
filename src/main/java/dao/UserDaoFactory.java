package dao;

import model.User;
import org.hibernate.Session;
import util.DBHelper;
import util.PropertiesReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserDaoFactory implements AbstractFactory{

    @Override
    public UserDao getUserDAOImpl() {
        PropertiesReader propertiesReader = new PropertiesReader();
        String daoType = propertiesReader.readConfig();
        if (daoType.equalsIgnoreCase("hibernate")) {
            System.out.println("Config is : " + daoType);
            return new UserHibernateDao(DBHelper.getInstatnce().getConfiguration());
        }
        if (daoType.equalsIgnoreCase("jdbc")) {
            System.out.println("Config is : " + daoType);
            return new UserJdbcDao(DBHelper.getInstatnce().getConnection());
        }
        return null;
    }
}