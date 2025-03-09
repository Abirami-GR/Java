package in.kgcoding.Challenge77.com.example.utils;

import in.kgcoding.Challenge77.com.example.geomentry.GeoCircle;
import in.kgcoding.Challenge77.com.example.geomentry.GeoRectangle;

public class UtilsCalculator {
    public static void main(String[] args) {
        GeoCircle gc = new GeoCircle(5.5);
        System.out.println("Geometry Circle");
        double cirArea = Math.PI * Math.pow(gc.radius, 2);
        System.out.printf("Area of a Circle: %f \n\n\n", cirArea);

        GeoRectangle gr = new GeoRectangle(10, 5) ;
        System.out.println("Geometry Rectangle");
        double rectArea = gr.length * gr.width;
        System.out.printf("Area of a Rectangle: %f" , rectArea);


    }
}
