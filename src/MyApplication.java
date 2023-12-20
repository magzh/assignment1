import Models.Point;
import Models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\magzh\\IdeaProjects\\assignment1\\src\\Source");
        Scanner scanner = new Scanner(file);
        Shape shape = new Shape();
        while (scanner.hasNextLine()){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        System.out.println("Perimeter is  " + shape.getPerimeter());
        System.out.println("Average side is " + shape.getAverage());
        System.out.println("Longest side is " + shape.getLongest());
    }
}