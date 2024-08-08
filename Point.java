public class Point extends Figure {

    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Move(double deltaX, double deltaY){
        this.x += deltaX; 
        this.y += deltaY;
    }

    public void Rotate(double angle, Point start){

        double radians = Math.toRadians(angle);

        double startPointX = start.x;
        double startPointY= start.y;

        double tempX = this.x - startPointX;
        double tempY = this.y - startPointY;

        double newPointX = tempX * Math.cos(radians) - tempY * Math.sin(radians) + startPointX;
        double newPointY = tempX * Math.sin(radians) + tempY * Math.cos(radians) + startPointY;

        this.x = newPointX;
        this.y = newPointY;
    }

    public String toString() {
        return String.format("Point(%.1f, %.1f)", x, y);
    }

}
