public class Test {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(2, 3, 4, 5);
        a1.rect_print();
        a1.move();
        a1.rect_print();
        a1.getLength();
        a1.getWidth();
        a1.getPerimeter();
        a1.getArea();
        a1.assertSquare();

        Rectangle a2 = new Rectangle(4, 10);
        a2.rect_print();
        a2.move();
        a2.rect_print();
        a2.getLength();
        a2.getWidth();
        a2.getPerimeter();
        a2.getArea();
        a2.assertSquare();

        Rectangle a3 = new Rectangle();
        a3.rect_print();
        a3.move();
        a3.rect_print();
        a3.getLength();
        a3.getWidth();
        a3.getPerimeter();
        a3.getArea();
        a3.assertSquare();
    }


}
