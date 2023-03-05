package com.company.shapes.logic;


import static java.lang.Math.sqrt;

import com.company.shapes.ui.OutputInterface;

public class Logic
        implements LogicInterface {

    public static final String TAG =
            Logic.class.getName();

    private OutputInterface mOut;


    private static double mRadius = 0;
    private static double mLength = 0;
    private static double mWidth = 0;
    private static double mHeight = 0;


    public Logic(OutputInterface out){
        mOut = out;
    }

    @Override
    public void process() {

        Shapes shapeForCalculations = mOut.getShape();


        mLength = mOut.getLength();
        mWidth = mOut.getWidth();
        mHeight = mOut.getHeight();
        mRadius = mOut.getRadius();

        switch (shapeForCalculations) {
            case Box:
                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " by "
                        + mHeight
                        + " box has a volume of: ");
                mOut.println(""
                        + String.format("%.2f",
                        boxVolume(mLength, mWidth, mHeight)));
                mOut.println("");

                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " by "
                        + mHeight
                        + " box has a surface area of: ");
                mOut.println(""
                        + String.format("%.2f",
                        boxSurfaceArea(mLength, mWidth, mHeight)));
                mOut.println("");

            case Rectangle:
                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " rectangle has a perimeter of: ");
                mOut.println("" + String.format("%.2f",
                        rectanglePerimeter(mLength, mWidth)));
                mOut.println("");

                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " rectangle has area of: ");
                mOut.println("" + String.format("%.2f", rectangleArea(mLength, mWidth)));
                mOut.println("");
                break;
            case Sphere:
                mOut.print("A sphere with radius " + mRadius + " has a volume of: ");
                mOut.println("" + String.format("%.2f", sphereVolume(mRadius)));
                mOut.println("");

                mOut.print("A sphere with radius " + mRadius + " has surface area of: ");
                mOut.println("" + String.format("%.2f", sphereSurfaceArea(mRadius)));
                mOut.println("");
                // Same here as with 'Box' above. If 'Sphere' is picked, it will run the
                // two sets of print statements above and the two below until the 'break;'
            case Circle:
                mOut.print("A circle with radius " + mRadius + " has a perimeter of: ");
                mOut.println("" + String.format("%.2f", circleCircumference(mRadius)));
                mOut.println("");

                mOut.print("A circle with radius " + mRadius + " has area of: ");
                mOut.println("" + String.format("%.2f", circleArea(mRadius)) );
                mOut.println("");
                break;
            case Triangle:
                mOut.print("A right triangle with base "
                        + mLength
                        + " and height "
                        + mWidth + " has a perimeter of: ");
                mOut.println(""
                        + String.format("%.2f", rightTrianglePerimeter(mLength,
                        mWidth)));
                mOut.println("");

                mOut.print("A right triangle with base "
                        + mLength
                        + " and height "
                        + mWidth
                        + " has area of: ");
                mOut.println(""
                        + String.format("%.2f", rightTriangleArea(mLength,
                        mWidth)));
                mOut.println("");
                break;
            default:
                break;
        }
    }

    static double rightTriangleArea(double mLength, double mWidth) {
        return mLength*mWidth*0.5;

    }

    static double rightTrianglePerimeter(double mLength, double mWidth) {
        double gip;
        gip = Math.sqrt(Math.pow(mLength,2)+Math.pow(mWidth,2));
        return mLength+mWidth+gip;
    }

    static double circleArea(double mRadius) {
        return Math.PI*Math.pow(mRadius,2);
    }


    static double circleCircumference(double mRadius) {
        return  2*Math.PI* mRadius;
    }

    static double sphereSurfaceArea(double mRadius) {
        return  4 * Math.PI* Math.pow(mRadius,2);
    }

    static double sphereVolume(double mRadius) {
        return  (4.0/3.0) * Math.PI* Math.pow(mRadius,3);
    }


    static double boxSurfaceArea(double mLength, double mWidth, double mHeight) {
        return 2*mLength*mWidth + 2*mHeight*mWidth + 2*mLength*mHeight;
    }

    static double rectanglePerimeter(double mLength, double mWidth) {
        return 2*(mLength+mWidth);
    }

    static double boxVolume(double mLength, double mWidth, double mHeight) {
        return mLength*mWidth*mHeight;
    }

    // TODO -- add your code here

    public  static double  rectangleArea(double a, double b){
        return a*b;
    }



}