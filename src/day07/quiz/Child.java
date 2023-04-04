package day07.quiz;

public class Child extends Parent {
    private String name;

    public Child() { this("String");
        System.out.println("Child() call");
    }
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String) call");
    }
}
