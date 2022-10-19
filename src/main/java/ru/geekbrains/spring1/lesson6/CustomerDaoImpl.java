package ru.geekbrains.spring1.lesson6;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao{


    private SessionFactoryUtils sessionFactoryUtils;


    public CustomerDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }


    @Override
    public List<Product> findProductsByCustomerId(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Customer customer = session.get(Customer.class, id);
            List<Product> products = customer.getProducts();
            session.getTransaction().commit();
            return products;
        }
    }
}
