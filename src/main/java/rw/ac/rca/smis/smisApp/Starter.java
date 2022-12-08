package rw.ac.rca.smis.smisApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.smis.orm.*;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class Starter {

    public static void main(String args[]) {
        Address add1 = new Address("Rwanda", "kigali");
        Student st1 = new Student("Dorki","kigal" ,300);
        st1.setAddress(add1);
        Instructor instr1 = new Instructor(25000, "Mugabo", new Date(), 'm');
        Course crs1 = new Course("Physics", "Bosco", "Alice");

        Mark mrk1 = new Mark(20.43);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        System.out.println("Opening the session .............");
        @SuppressWarnings("deprecation")

        SessionFactory factory= config.buildSessionFactory();
        Session session= factory.openSession();

        System.out.println("Begining transaction.............");
        Transaction transaction= session.beginTransaction();
        session.saveOrUpdate(add1);
        session.saveOrUpdate(crs1);
        session.saveOrUpdate(instr1);
        session.saveOrUpdate(mrk1);

        transaction.commit();
        session.close();
        factory.close();


    }
}
