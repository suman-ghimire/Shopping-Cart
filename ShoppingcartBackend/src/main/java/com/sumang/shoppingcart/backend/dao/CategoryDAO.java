package com.sumang.shoppingcart.backend.dao;

import com.sumang.shoppingcart.backend.dto.Category;

import java.util.List;

public interface CategoryDAO {

    List<Category> list();

    Category get(int id);
}
