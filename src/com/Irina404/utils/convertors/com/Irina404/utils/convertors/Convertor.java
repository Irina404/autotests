package com.Irina404.utils.convertors.com.Irina404.utils.convertors;

/**
 * Created by PC on 01.08.2016.
 */
public class Convertor {
    public static void main (String args[]){

        byte byte1 = 127;
        short short1 = 0;
        int int1 = 0;
        long long1 = 0L;
        float float1 = 0.0f;
        double double1 = 0.0d;
        //correct conversion 64f<=32f<=64<=32<=16<=8
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
    }
}
