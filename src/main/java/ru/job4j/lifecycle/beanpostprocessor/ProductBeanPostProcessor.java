package ru.job4j.lifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.job4j.lifecycle.model.Product;

public class ProductBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Product product) {
            System.out.printf("3. BeanPostProcessBeforeInitialization: '%s'%n", product);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Product product) {
            System.out.printf("5. BeanPostProcessAfterInitialization: '%s'%n", product);
        }
        return bean;
    }
}
