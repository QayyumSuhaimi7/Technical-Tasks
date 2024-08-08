public class Task1 {

    public static void main(String[]args) {
        
        Point start = new Point(2, 1);
        Point point = new Point(3, 5);

        System.out.println("Initial Position: " + point);

        point.Move(2, 3);
        System.out.println("After Move: "+ point);

        point.Rotate(45, start);
        System.out.println("After Rotation: " + point);

    } 

}
