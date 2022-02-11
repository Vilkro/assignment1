package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> allPoints;
    private ArrayList<Double> distances;

    public Shape(){
        allPoints = new ArrayList<>();
        distances = new ArrayList<>();
    }

    public void addPoint(Point point){
        allPoints.add(point);
    }

    public void addDistance(double distance){
        distances.add(distance);
    }

    public ArrayList<Point> getPoints(){
        return allPoints;
    }

    public void calculateDistances(){
        for(int i = 0; i < allPoints.size() - 1; i++){
            distances.add(allPoints.get(i).distance(allPoints.get(i+1)));
        }
        distances.add(allPoints.get(0).distance(allPoints.get(allPoints.size() - 1)));
    }

    public int getSizeOfDistances(){
        return distances.size();
    }

    public Double getDistance(int index) {
        return distances.get(index);
    }

    public double calculateP(){
        double total = 0;
        for(int i = 0; i < distances.size(); i++) {
            total += getDistance(i);
        }
        return total;
    }

    public double getLongSide(){
        double max = 0;
        double temp = 0;
        for(int i = 0; i < distances.size(); i++){
            temp = getDistance(i);
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }

    public double getAverageLength(){
        return calculateP() / allPoints.size();
    }

}
