package com.excercise.Assignment.Controller;

import com.excercise.Assignment.restService.ParentEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping(path ="/parentEntity")
public class EntitiesController {

    @GetMapping(path = "/")
    public Map<String, String> entity(){
        return new ParentEntity().getData();
    }
    @GetMapping(path="/subEntities/")
    public Set children(){
        return new ParentEntity().getSubEntities();
    }
    @PostMapping(path="/entity/{ID}/{name}")
    public ParentEntity addEntity(@PathVariable("ID") String ID, @PathVariable("name") String parentEntityName){
        ParentEntity entity = new ParentEntity();
        entity.setID(ID);
        entity.setName(parentEntityName);
        entity.addEntity();
        return entity;


    }
}
