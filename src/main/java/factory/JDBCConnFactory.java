package factory;

public class JDBCConnFactory implements ConnectionFactory {
    @Override
    public JDBC getConnect() {
        System.out.println("Create JDBC connection in " + getClass());
        return new JDBCImpl();
    }
}
