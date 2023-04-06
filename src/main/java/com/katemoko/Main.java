package com.katemoko;

public class Main {
    public static void main(String[] args) {
        byte byteVar = 30;
        short shortVar = 16_000;
        int intVar1 = 123_456;
        int intVar2 = 20;
        long longVar = 2_147_483_647_000L;
        float floatVar = 0.123F;
        double doubleVar = 304.458_779;
        boolean booleanVar1 = true;
        boolean booleanVar2 = false;

        //Basic arithmetic operators
        System.out.println("byteVar + shortVar = " + (byteVar + shortVar));
        System.out.println("shortVar - byteVar = " + (shortVar - byteVar));
        System.out.println("intVar1 * intVar2 = " + (intVar1 * intVar2));
        System.out.println("intVar1 / intVar2 = " + (intVar1 / intVar2));
        System.out.println("1.0 * intVar1 / intVar2 = " + (1.0 * intVar1 / intVar2));
        System.out.println("shortVar % byteVar = " + (shortVar % byteVar));
        System.out.println("");

        //Int and double calculations
        System.out.println("intVar2 + doubleVar = " + (intVar2 + doubleVar));
        System.out.println("intVar2 - doubleVar = " + (intVar2 - doubleVar));
        System.out.println("intVar2 * doubleVar = " + (intVar2 * doubleVar));
        System.out.println("doubleVar / intVar2 = " + (doubleVar / intVar2));
        System.out.println("");

        //Increment and decrement
        System.out.println("byteVar = " + byteVar);
        System.out.println("byteVar++ = " + (byteVar++));
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("++shortVar = " + (++shortVar));
        System.out.println("shortVar = " + shortVar);
        System.out.println("intVar1 = " + intVar1);
        System.out.println("intVar1-- = " + (intVar1--));
        System.out.println("intVar1 = " + intVar1);
        System.out.println("intVar2 = " + intVar2);
        System.out.println("--intVar2 = " + (--intVar2));
        System.out.println("intVar2 = " + intVar2);
        System.out.println("");

        //Overflow
        int intVar3 = Integer.MAX_VALUE;
        int sumInt = intVar3 + 10;
        long sumLong = (long) intVar3 + 10L;
        System.out.println("Result for (intVar3 + 10) = " + sumInt + ", but correct result = " + sumLong);
        System.out.println("");

        //Comparison operators
        System.out.println("doubleVar == floatVar = " + (doubleVar == floatVar));
        System.out.println("doubleVar != floatVar = " + (doubleVar != floatVar));
        System.out.println("longVar > intVar1 = " + (longVar > intVar1));
        System.out.println("longVar < intVar1 = " + (longVar < intVar1));
        System.out.println("byteVar >= shortVar = " + (byteVar >= shortVar));
        System.out.println("byteVar <= shortVar = " + (byteVar <= shortVar));
        System.out.println("");

        //Logical operators
        String month = "June";
        int dayOfMonth = 20;
        if (month.equals("June") || month.equals("July") || month.equals("August"))
            System.out.println(month + " is summer month");
        else
            System.out.println(month + " is NOT summer month");
        if (month.equals("June") && dayOfMonth >= 1 && dayOfMonth <= 30)
            System.out.println(dayOfMonth + " " + month + " is a correct date");
        else
            System.out.println(dayOfMonth + " " + month + " is incorrect date");
    }
}