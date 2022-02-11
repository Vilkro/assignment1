package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/User/Documents/oop/file1.txt");
        File file2 = new File("C:/Users/User/Documents/oop/file2.txt");
        Scanner sc = new Scanner(file);
        Scanner sc2 = new Scanner(file2);
        for(int i = 0; i <= 1; i++){
            if(i == 0){
                sc = new Scanner(file);
                sc2 = new Scanner(file);
                System.out.println("file1.txt");
            }
            else if(i == 1){
                sc = new Scanner(file2);
                sc2 = new Scanner(file2);
                System.out.println("file2.txt");
            }
            double x, y;
            int num = 1;
            Shape NewShape = new Shape();
            while (sc.hasNextInt()){
                x = sc.nextInt();
                y = sc.nextInt();
                Point Coord = new Point(x, y);
                NewShape.addPoint(Coord);
            }
            NewShape.calculateDistances();
            for(int j = 0; j < NewShape.getSizeOfDistances(); j++){
                System.out.println(num + ".Distance: " + NewShape.getDistance(j));
                num++;
            }
            System.out.println("Perimeter: " + NewShape.calculateP());
            System.out.println("Long Side: " + NewShape.getLongSide());
            System.out.println("Average Length: " + NewShape.getAverageLength() + "\n");
        }
    }
}