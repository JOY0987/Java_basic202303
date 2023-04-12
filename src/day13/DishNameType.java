package day13;

public class DishNameType {

    private final String name;
    private final Dish.Type type;


    public DishNameType(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType();
    }

    public String getName() {
        return name;
    }

    public Dish.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "exerciseDish{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
