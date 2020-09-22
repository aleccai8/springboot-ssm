package com.springboot.ssm.service.impl;


import com.springboot.ssm.dao.mapper.CategoryMapper;
import com.springboot.ssm.dao.pojo.Category;
import com.springboot.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryMapper categoryMapper;
    @Autowired
    public void DI(CategoryMapper categoryMapper){
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
