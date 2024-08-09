public class Task1 {

    public static void main(String[]args) {
        
        Point start = new Point(7.8, 2.2);

        // Testing

        // Point point = new Point(4, 6);

        // Line line = new Line( new Point(2,4), new Point(7, 6));

        // Circle circle = new Circle(new Point(4,8), 9);

        // System.out.println("\nInitial Position [Point] : " + point);
        // System.out.println("Initial Position [Line] : " + line);
        // System.out.println("Initial Position [Circle] : " + circle);
        // System.out.println();

        // point.Move(3, -2);
        // line.Move(3, -2);
        // circle.Move(3, -2);
        // System.out.println("After Move [Point] : "+ point);
        // System.out.printlBasen("After Move [Line] : "+ line);
        // System.out.println("After Move [Circle] : " + circle);
        // System.out.println();

        // point.Rotate(30, start);
        // line.Rotate(30, start);
        // circle.Rotate(30, start);

        Aggregation aggregation = new Aggregation();

        aggregation.addRandomFigure(5);

        System.out.println("\nInitial State: " + aggregation);
        aggregation.Move(2, 2);
        aggregation.Rotate(45, start);
        System.out.println("\nAfter Aggregation Move and Rotate: " + aggregation);
        System.out.println();

    } 

}
