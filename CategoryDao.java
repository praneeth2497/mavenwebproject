package com.praneeth.web1.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Category;

public interface CategoryDao {
boolean insert(Category category);
}
