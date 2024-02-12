package springProj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springProj.kk.Employee;

public class Appp {

  public static void main(String[] args) {
    // BeanFactory factory = new XmlBeanFactory(
    // new FileSystemResource("spring.xml")
    // );

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "spring.xml");
    Employee bean = context.getBean(Employee.class);

    System.out.println(bean);
  }
}
