package com.excercise.Assignment.restService;

import com.excercise.Assignment.Interface.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ParentEntity implements Entity {

    private String ID;
    private String EntityName;


    private Set<Entity> entities;
    private Map<String,String> data = new HashMap< >();


    @Override
    public Map<String, String> getData() {

        data.put(this.ID,this.EntityName);
        return data;
    }

    @Override
    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public Set getSubEntities() {
        return entities;
    }

    public String getName() {
        return EntityName;
    }

    public void setName(String name) {
        this.EntityName = EntityName;
    }
    public void addEntity(){
        entities.add(new ParentEntity());
    }

    @Override
    public String toString() {
        return "ParentEntity{" +
                "ID='" + ID + '\'' +
                ", EntityName='" + EntityName + '\'' +
                ", entities=" + entities +
                ", data=" + data +
                '}';
    }
}
