package ru.geekbrains.spring1.lesson6;

import org.hibernate.Session;

import java.util.List;

public class ProductDaoImpl implements ProductDao{

    private SessionFactoryUtils sessionFactoryUtils;


    public ProductDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public List<Customer> findCustomersByProductId(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            List<Customer> customers = product.getCustomers();
            session.getTransaction().commit();
            return customers;
        }
    }
}
