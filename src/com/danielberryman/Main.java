package com.danielberryman;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Integer has a width of 32
        // 2 ^ 31
        int myMin= -2_147_483_648;
        int myMax= 2_147_483_647;
        int myTotal= (myMin/2);
        System.out.println("myTotal = " + myTotal);

        // Byte has a width of 8
        byte myByteMin= -128;
        byte myByteMax= 127;
        byte myByte= (byte) (myByteMin/2);
        System.out.println("myByte = " + myByte);

        // Short has a width of 16
        short myShortMin= -32768;
        short myShortMax= 32767;
        short myShort= (short) (myShortMin/2);
        System.out.println("myShort = " + myShort);

        // Long has a width of 64
        // 2 ^ 63
        long myLongMin = 100L;
        long myLongMax = 100L;

        // Challenge
        byte cByte= 24;
        short cShort= 56;
        int cInt= 78;
        int cSum= cByte + cShort + cInt;
        System.out.println(cSum * 10);
        long cLong= 50_000L + 10L * cSum;
        System.out.println("cLong = " + cLong);
    }
}
