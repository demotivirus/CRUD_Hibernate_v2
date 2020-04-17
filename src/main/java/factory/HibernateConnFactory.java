package factory;

public class HibernateConnFactory implements ConnectionFactory {
    public Hibernate getConnect() {
        System.out.println("Create Hibernate connection in " + getClass());
        return new HibernateImpl();
    }
}
