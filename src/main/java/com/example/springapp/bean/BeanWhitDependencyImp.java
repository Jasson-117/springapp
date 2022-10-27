package com.example.springapp.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BeanWhitDependencyImp implements BeanWhitDependency{
   private MyOperation myOperation;
   private final Log LOGGER = LogFactory.getLog(BeanWhitDependencyImp.class);

    public BeanWhitDependencyImp(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void saludara() {
        LOGGER.info("mostrando informacion desde el bean con dependency");
        int num = 5;
        LOGGER.debug(num);
        System.out.println("suma de "+myOperation.sum(num));
        System.out.println("Hola desde el bean con dependencia");
    }
}
