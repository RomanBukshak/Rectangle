import java.util.Scanner;

public class Rectangle {
    private int x1, x2, y1, y2;
    private int length, width;

    public Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Rectangle(int x2, int y2){
        this.x2 = x2;
        this.y2 = y2;
        x1 = 0;
        y1 = 0;
    }

    public Rectangle(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }

    public String rect_print(){
        String massage = "Прямоугольник с координатами: (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")";
        System.out.println(massage);
        return massage;
    }

    public void move(){
        System.out.println("Введите значение dx:");
        int dx = new Scanner(System.in).nextInt();
        System.out.println("Введите значение dy:");
        int dy = new Scanner(System.in).nextInt();
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
    }

    public void getLength(){
        length = Math.abs(x1 - x2);
        System.out.println("Длина прямоугольника: " + length);
    }

    public void getWidth(){
        width = Math.abs(y2 - y1);
        System.out.println("Ширина прямоугольника: " + width);
    }

    public void getPerimeter(){
        int perimeter = 2*length + 2*width;
        System.out.println("Периметр прямоугольника: " + perimeter);
    }

    public void getArea(){
        int area = length * width;
        System.out.println("Площадь прямоугольника: " + area);
    }

    public void assertSquare(){
        System.out.println(width == length ? "Прямоугольник является квадратом":"Прямоугольник не является квадратом");
    }

}
