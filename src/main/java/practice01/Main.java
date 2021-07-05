package practice01;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.say());

        Polygon rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.calculatePerimetr());
        System.out.println(rectangle.getNumOfAngles());
        Polygon square = new Square(5);
        System.out.println("-----------------");
        System.out.println(square.getNumOfAngles());
        System.out.println(square.calculatePerimetr());
    }
}
