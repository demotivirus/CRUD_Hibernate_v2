package dao;

import util.DBHelper;
import util.PropertiesReader;

//Now i can create connection from all model like here
public class UserConnection{

    public UserDao connect() {
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