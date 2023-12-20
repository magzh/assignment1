package Models;

import java.util.ArrayList;

import static java.lang.Math.sqrt;


public class Shape {
    private ArrayList<Point> points = new ArrayList<>();
    public void addPoint(Point point){
        points.add(point);
    }
    public double getPerimeter(){
        ArrayList<Double> sides = getSides();
        double answer = 0.0;
        for (Double side : sides) {
            answer += side;
        }
        return answer;
    }
    public double getLongest(){
        ArrayList<Double> sides = getSides();
        double answer = 0.0;
        for (double temp : sides) {
            if (temp > answer) {
                answer = temp;
            }
        }
        return answer;
    }
    public double getAverage(){
        ArrayList<Double> sides = getSides();
        double total = 0.0;
        for (Double side : sides) {
            total += side;
        }
        return total / sides.size();
    }
    private ArrayList<Double> getSides(){
        ArrayList<Double> sides = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            if (i + 1 < points.size()){
                sides.add(points.get(i).calculateDistance(points.get(i+1)));
            }
            else{
                sides.add(points.get(i).calculateDistance(points.getFirst()));
            }
        }
        return sides;
    }
}
