package com.charith.previousExamples.Bitwise;

public class IntegerBitCount {

    public static void main(String[] args) {
        int integer = 20;

        // Initial version
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((integer & 1) == 1) {
                count++;
            }
            integer = integer >>> 1;
        }
        System.out.println(count);

        System.out.println(integer);
        //Improved version
        integer = 20;
        count=0;
        while(integer>0){
            ++count;
            integer &= integer -1;
        }
        System.out.println(count);
    }

}
