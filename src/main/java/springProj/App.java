package springProj;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springProj.kk.Test;

// @Configuration
// @ComponentScan(basePackages = "springProj")
public class App {
    public static void main(String[] args) {

        // ApplicationContext-----------------.

        ClassPathXmlApplicationContext a1 = new ClassPathXmlApplicationContext("spring.xml");
        // ApplicationContext context = new
        // AnnotationConfigApplicationContext(AppConfig.class);
        // Shape bean2 = context.getBean(Circle.class);
        // ApplicationContext a1 =
        // FileSystemXmlApplicationContext("C:\\spring\\src\\main\\resources\\spring.xml");

        // AnnotationConfigApplicationContext a1 = new
        // AnnotationConfigApplicationContext(AppConfig.class);
        // AnnotationConfigApplicationContext a1 = new
        // AnnotationConfigApplicationContext();
        // a1.scan("springProj.kk");
        // a1.refresh();

        // Shape bean = a1.getBean(Triangle.class);
        Shape bean2 = a1.getBean(Circle.class);

        // System.out.println(bean);
        System.out.println(bean2);

        // Triangle t1 = (Triangle) a1.getBean("triangle2");
        // t1.draw();

        // ((AbstractApplicationContext) a1).close();

        // bean factory//////////
        // BeanFactory b1 = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        // Triangle bean = (Triangle) b1.getBean("triangle");

        // bean.draw();

        //

        // OrgInfo orgInfo = a1.getBean("orgInfo", OrgInfo.class);
        // System.out.println(orgInfo);

        // Second bean3 = a1.getBean(Second.class);
        // System.out.println(bean3);

        // First bean4 = a1.getBean(First.class);
        // System.out.println(bean4);

        a1.registerShutdownHook();
    }
}
