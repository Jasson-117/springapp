package com.example.springapp.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement2 implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola desde el componente 2");
    }
}
