package factory;

import org.hibernate.SessionFactory;

public interface Hibernate extends Connect{
    SessionFactory getConfiguration();
}
