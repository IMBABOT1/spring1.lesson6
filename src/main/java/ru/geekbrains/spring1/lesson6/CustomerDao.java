package ru.geekbrains.spring1.lesson6;

import java.util.List;

public interface CustomerDao {



    List<Product> findProductsByCustomerId(Long id);
}
