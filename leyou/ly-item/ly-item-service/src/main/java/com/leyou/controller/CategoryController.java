package com.leyou.controller;

import com.leyou.item.pojo.Category;
import com.leyou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("getCategoryByPid")
    public ResponseEntity<List<Category>> getCategoryByPid(@RequestParam Long pid){
        List<Category> list = this.categoryService.selectByPId(pid);
        if(list == null || list.size() < 1){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(list);
    }

}
