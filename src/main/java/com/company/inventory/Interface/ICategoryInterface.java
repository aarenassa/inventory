package com.company.inventory.Interface;

import com.company.inventory.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryInterface extends CrudRepository<Category, Long> {

}
