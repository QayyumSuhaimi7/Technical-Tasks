public class Line extends Figure {

    protected Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void Move(double deltaX, double deltaY) {
        startPoint.Move(deltaX, deltaY);
        endPoint.Move(deltaX, deltaY);
    }

    public void Rotate(double angle, Point start) {
        startPoint.Rotate(angle, start);
        endPoint.Rotate(angle, start);
    }

    public String toString() {
        return String.format("Line (Start %s, End %s)", startPoint, endPoint);
    }

}