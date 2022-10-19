package ru.geekbrains.spring1.lesson6;

public class Main {


    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        CustomerDao customerDao = new CustomerDaoImpl(sessionFactoryUtils);

        ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);

        System.out.println(productDao.findCustomersByProductId(1l));

        System.out.println(customerDao.findProductsByCustomerId(1l));
    }
}
