package com.vasi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width of int = 32 bits (4 bytes)
    int intvalue=5;
        //width of float = 32 bits (4 bytes)
    float floatvalue = 5.7777777777f;
        //width of double = 64 bits (8 bytes)
    double doublevalue = 5.7777777777777777777777777777777777777d;

        System.out.println(intvalue/3);
        System.out.println(floatvalue/3);
        System.out.println(doublevalue/3);


        //ponds to kilograms
        double numPounds = 200.0d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
    }
}
