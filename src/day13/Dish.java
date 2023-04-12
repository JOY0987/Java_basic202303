package day13;

public class Dish {
    
    private final String name; // 요리 이름
    private final boolean vegererian; // 채식주의 여부
    private final int calories; // 칼로리
    private final Type type; // 요리 카테고리

    public enum Type {
        MEAT, FISH, OTHER
    }

    public Dish(String name, boolean vegererian, int calories, Type type) {
        this.name = name;
        this.vegererian = vegererian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegererian() {
        return vegererian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegererian=" + vegererian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
