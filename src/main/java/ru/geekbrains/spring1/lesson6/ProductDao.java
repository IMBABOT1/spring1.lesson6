package ru.geekbrains.spring1.lesson6;

import java.util.List;

public interface ProductDao {

    List<Customer> findCustomersByProductId(Long id);
}
