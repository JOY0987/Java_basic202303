package day09.inter;

public class Main {

    public static void main(String[] args) {

        // 객체가 어떤 역할을 할 수 있는지 바로바로 알 수 있음
        BullDog bullDog = new BullDog();
        bullDog.hunt();
        bullDog.violent();

        Duck duck = new Duck();
        duck.eat();
        
        // 인터페이스는 다형성을 구현하는 역할
        Pet[] pets = {
                bullDog, duck
        };

        for (Pet pet : pets) {
            pet.eat();
        }

        BadAnimal shark = new Shark();
        shark.hunt();
    }
}
