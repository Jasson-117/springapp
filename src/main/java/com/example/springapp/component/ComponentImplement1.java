package com.example.springapp.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement1 implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("hola desde el componente1 ");
    }
}
