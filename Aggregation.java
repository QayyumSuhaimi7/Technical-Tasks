import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Aggregation {

    protected List<Figure> figures;
    private static final Random RANDOM = new Random();

    public Aggregation() {
        this.figures = new ArrayList<>();
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void addRandomFigure(int randomFigure) {
        for (int i = 0; i < randomFigure; i++) {
            Figure figure = createRandomFigure();
            addFigure(figure);
        }
    }

    private Figure createRandomFigure() {
        int figureType = RANDOM.nextInt(3);
        switch (figureType) {
            case 0:
                return createRandomPoint();
            case 1:
                return createRandomLine();
            case 2:
                return createRandomCircle();
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    private Point createRandomPoint() {
        return new Point(RANDOM.nextDouble() * 10, RANDOM.nextDouble() * 10);
    }

    private Line createRandomLine() {
        return new Line(
                new Point(RANDOM.nextDouble() * 10, RANDOM.nextDouble() * 10),
                new Point(RANDOM.nextDouble() * 10, RANDOM.nextDouble() * 10));
    }

    private Circle createRandomCircle() {
        return new Circle(
                new Point(RANDOM.nextDouble() * 10, RANDOM.nextDouble() * 10),
                RANDOM.nextDouble() * 10);
    }

    public void Move(double deltaX, double deltaY) {
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            figure.Move(deltaX, deltaY);
        }
    }

    public void Rotate(double angle, Point start) {
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            figure.Rotate(angle, start);
        }
    }

    public String toString() {
        String result="\n";
        int j = 1;
        for (int i = 0; i < figures.size(); i++) {
            result += (j) + ". " + figures.get(i).toString(); 
            if (i < figures.size() - 1) {
                result += "\n"; 
            }
            j++;
        }
        return result;
    }

}