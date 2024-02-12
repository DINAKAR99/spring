package springProj.kk;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Test {
    public String name;
    public int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Test [name=" + name + ", roll=" + roll + "]";
    }
}
