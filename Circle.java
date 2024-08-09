public class Circle extends Figure {

    protected Point centerPoint;
    protected double radius;

    public Circle(Point centerPoint, double radius){
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public void Move(double deltaX, double deltaY) {
        centerPoint.Move(deltaX, deltaY);
    }

    public void Rotate(double angle, Point start){
        centerPoint.Rotate(angle, start);
    }

    public String toString() {
        return String.format("Circle (Center %s, Radius %.1f)", centerPoint, radius);
    }

}
