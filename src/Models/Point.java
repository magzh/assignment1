package Models;

import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double calculateDistance(Point p1){
        return sqrt( (p1.getX() - this.getX())*(p1.getX() - this.getX()) + (p1.getY() - this.getY())*(p1.getY() - this.getY()));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
