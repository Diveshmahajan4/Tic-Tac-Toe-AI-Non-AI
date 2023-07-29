package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int xCoordinates, int yCoordinates){
        this.x = xCoordinates;
        this.y = yCoordinates;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
