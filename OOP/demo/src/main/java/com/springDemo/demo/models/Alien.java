package com.springDemo.demo.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Alien {
    private int id;
    private String name;
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                ", id=" + id + '\'' +
                ", name='" + name +
                ", tech='" + tech + '\'' +
                '}';
    }

}
