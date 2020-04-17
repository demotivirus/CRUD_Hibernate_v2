package factory;

import java.sql.Connection;

public interface JDBC extends Connect{
    Connection getConnection();
}
