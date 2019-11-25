package com.sumang.shoppingcart.frontend.controller;

import com.sumang.shoppingcart.backend.dao.CategoryDAO;
import com.sumang.shoppingcart.backend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Home");
//        passing categories
        mv.addObject("categories", categoryDAO.list());
        mv.addObject("userClickHome", true);
        return mv;
    }

    @RequestMapping(value = "/about")
    public ModelAndView about() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "About Us");
        mv.addObject("userClickAbout", true);
        return mv;
    }

    @RequestMapping(value = "/contact")
    public ModelAndView contact() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Contact Us");
        mv.addObject("userClickContact", true);
        return mv;
    }

    //    methods to load all the products based on category
    @RequestMapping(value = "/show/all/products")
    public ModelAndView showAllProducts() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "All Products");
//        passing categories
        mv.addObject("categories", categoryDAO.list());
        mv.addObject("userClickAllProducts", true);
        return mv;
    }


    //    methods to load all the products based on category
    @RequestMapping(value = "/show/category/{id}/products")
    public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("page");

//        CategoryDAO to fetch a single category
        Category category = null;

        category = categoryDAO.get(id);
        mv.addObject("title", category.getName());
//        passing categories
        mv.addObject("categories", categoryDAO.list());

//        passing the single category object
        mv.addObject("category", category);
        mv.addObject("userClickCategoryProducts", true);
        return mv;
    }




}
