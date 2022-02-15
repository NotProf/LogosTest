package less5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Flower[] bucket = new Flower[3];
        bucket[0] = new Roza(25, "red");
        bucket[1] = new Tulpan(20, "Yellow");
        bucket[2] = new Romashka(15, "White");

        int sum = 0;
        for (int i = 0; i < bucket.length; i++) {
            sum += bucket[i].price;
        }

        for (Flower flower : bucket) {
            sum += flower.price;
        }
        System.out.println(sum);
    }
}

abstract class Flower {

   protected int price;
   protected String color;

    public Flower(int price, String color) {
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return price == flower.price &&
                Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

class Romashka extends Flower {
    public Romashka(int price, String color) {
        super(price, color);
    }
}

class Roza extends Flower {
    public Roza(int price, String color) {
        super(price, color);
    }
}

class Tulpan extends Flower {
    public Tulpan(int price, String color) {
        super(price, color);
    }
}