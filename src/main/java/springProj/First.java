package springProj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class First implements BeanPostProcessor, Ordered {
    @Override
    public int getOrder() {

        return 1;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "First [name=" + name + "]";
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("in the after init post processor method" + bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("in the before init post processor method" + bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
