package dao;

public interface AbstractFactory {
    UserDao getUserDAOImpl();
}
