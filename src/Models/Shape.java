package Models;

import java.util.ArrayList;

import static java.lang.Math.sqrt;


public class Shape {
    private ArrayList<Point> points = new ArrayList<>();
    public Shape(){

    }
    public void addPoint(Point point){
        points.add(point);
    }
    public double getPerimiter(){
        double answer = 0.0;
        for (int i = 0; i < points.size(); i++) {
            if (i + 1 < points.size()){
                answer += points.get(i).calculateDist(points.get(i+1));
            }
            else{
                answer += points.get(i).calculateDist(points.getFirst());
            }
        }
        return answer;
    }
    public double getLongest(){
        double answer = 0.0;
        for (int i = 0; i < points.size(); i++) {
            if (i + 1 < points.size()){
                double temp = points.get(i).calculateDist(points.get(i+1));
                if (temp > answer){
                    answer = temp;
                }
            }
            else{
                double temp = points.get(i).calculateDist(points.getFirst());
                if (temp > answer){
                    answer = temp;
                }
            }
        }
        return answer;
    }
    public double getAverage(){
        double total = 0.0;
        for (int i = 0; i < points.size(); i++) {
            if (i + 1 < points.size()){
                total += points.get(i).calculateDist(points.get(i+1));
            }
            else{
                total += points.get(i).calculateDist(points.getFirst());
            }
        }
        return total / points.size();
    }
}
