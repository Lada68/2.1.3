package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
private Timer timer = new Timer();
    private  Animal animal = new Cat();
    private Animal animal1 = new Dog();
@Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, @Qualifier("cat") Animal animal1) {
        this.animal = animal;
        this.animal1 = animal1;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
        System.out.println("Say:");
        System.out.println(animal1.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
