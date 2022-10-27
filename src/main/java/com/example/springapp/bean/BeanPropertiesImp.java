package com.example.springapp.bean;

public class BeanPropertiesImp implements BeanProperties{
    private String name;
    private String apellido;

    public BeanPropertiesImp(String name, String apelike) {
        this.name = name;
        this.apellido = apelike;
    }

    @Override
    public String function() {
        return this.name+"-" +this.apellido;
    }
}
