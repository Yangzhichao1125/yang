package com.leyou.controller;

import com.leyou.item.pojo.SpecParam;
import com.leyou.item.pojo.Specification;
import com.leyou.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    @GetMapping("{id}")
    public ResponseEntity<String> querySpecificationByCategoryId(@PathVariable("id") Long id){
        Specification spec = this.specificationService.queryById(id);
        if (spec == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(spec.getSpecifications());
    }
    @GetMapping("/params")
    public ResponseEntity<List<SpecParam>> querySpecParam(
            @RequestParam(value="gid", required = false) Long gid,
            @RequestParam(value="cid", required = false) Long cid,
            @RequestParam(value="searching", required = false) Boolean searching,
            @RequestParam(value="generic", required = false) Boolean generic
    ){
        List<SpecParam> list =
                this.specificationService.querySpecParams(gid,cid,searching,generic);
        if(list == null || list.size() == 0){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(list);
    }
}
