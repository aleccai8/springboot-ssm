package com.springboot.ssm.controller;

import com.springboot.ssm.dao.pojo.Category;
import com.springboot.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CategoryController {


    private CategoryService categoryService;
    @Autowired
    public void DI(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @RequestMapping("listCategory")
    public String listCategory(HttpServletRequest request){
        List<Category> cs = categoryService.list();
        System.out.println(request.getParameter("test"));
        return cs.toString();
    }

}
