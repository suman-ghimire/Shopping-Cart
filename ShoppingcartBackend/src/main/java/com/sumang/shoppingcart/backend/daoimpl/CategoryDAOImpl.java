package com.sumang.shoppingcart.backend.daoimpl;

import com.sumang.shoppingcart.backend.dao.CategoryDAO;
import com.sumang.shoppingcart.backend.dto.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
    private static List<Category> categories = new ArrayList<Category>();

    static {
        Category category = new Category();

//        adding first category
        category.setId(1);
        category.setName("Television");
        category.setDescription("This is description for television");
        category.setImageURL("CAT_1.png");
        categories.add(category);

//        adding second category
        category = new Category();
        category.setId(2);
        category.setName("SmartPhone");
        category.setDescription("This is description for mobile");
        category.setImageURL("CAT_2.png");
        categories.add(category);


//        adding third category
        category = new Category();
        category.setId(3);
        category.setName("Laptop");
        category.setDescription("This is description for laptop");
        category.setImageURL("CAT_3.png");
        categories.add(category);

        //        adding fourth category
        category = new Category();
        category.setId(4);
        category.setName("Gadget Accessories");
        category.setDescription("This is description for gadgets Accessories");
        category.setImageURL("CAT_4.png");
        categories.add(category);

    }

    public List<Category> list() {
        return categories;
    }

    public Category get(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
