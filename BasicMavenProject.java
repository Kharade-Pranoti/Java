// basic hibernate program
// connection java application to the database through hibernate

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import javax.persistence.*;

public class App 
{
    public static void main( String[] args )
    {
    //  SessionFactory factory = new Configuration().configure().buildSessionFactory();
      
        Configuration cfg = new Configuration();
      
       // mandatory to mention the path otherwise it will give us error saying cannot locate the xml file when hibernate does not find the xml file path
        cfg.configure("com/demo/hibernate.cfg.xml");

      // building the session factory through Configuration instance
        SessionFactory factory = cfg.buildSessionFactory();
       
      
      // This will print the fully qualified name of the Session factory's implementation class
      // SessionFactoryImpl and the hashcode (SessionFactory is i/f)
      System.out.println(factory);
      
      // To check whether the factory or session is closed or not
      // if closed - returns false otherwise returns true
      System.out.println(factory.isClosed());
    }
}
