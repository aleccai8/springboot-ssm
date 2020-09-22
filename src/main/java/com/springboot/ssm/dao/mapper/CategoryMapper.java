package com.springboot.ssm.dao.mapper;

import com.springboot.ssm.dao.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CategoryMapper {
    int add(Category category);

    void delete(int id);

    Category get(int id);

    int update(Category category);

    List<Category> list();

    int count();
}
