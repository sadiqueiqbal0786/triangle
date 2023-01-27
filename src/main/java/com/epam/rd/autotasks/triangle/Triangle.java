package com.epam.rd.autotasks.triangle;

import static java.awt.geom.Point2D.distance;
import static java.lang.Math.sqrt;

class Triangle {
    Point a,b,c;


    public Triangle(Point a, Point b, Point c) {
       double p1 = length(a,b);
       double p2 = length(b,c);
       double p3 = length(a,c);
       if((p1+p2)<=p3 || (p2+p3)<=p1 || (p3+p1)<=p2){
           throw new IllegalArgumentException();
       }
           this.a=a;
           this.b=b;
           this.c=c;

    }

    public double area() {

        double p1 = length(a,b);
        double p2 = length(b,c);
        double p3 = length(a,c);
        double s = (p1+p2+p3) / 2;
        return Math.sqrt(s * (s - p1) * (s - p2) * (s - p3));
    }

    public Point centroid(){

        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;

        return new Point(x, y);
    }
    public double length(Point a, Point b)
    {
        // double distance = Math.sqrt(Math.pow((b.getX()-a.getX()),2)+Math.pow((b.getY()-a.getY()),2));
        double xDiff = b.getX() - a.getX();
        double yDiff = b.getY() - a.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}
