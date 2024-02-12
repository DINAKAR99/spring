package springProj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

@Component
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("its a circle point is" + center.getX() + "," + center.getY());

    }

    private point center;

    public Circle() {
    }

    public Circle(point center) {
        this.center = center;
    }

    public point getCenter() {
        return center;
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("init of circle ");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("destroy of circle ");
    }

    @Resource()
    public void setCenter(point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle [center=" + center + "]";
    }

}
