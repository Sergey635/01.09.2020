package com.company;

public class Main {

    public static void main(String[] args) {
	int chislo = 123;
	String chislo2 = "123";
	String result = chislo2 + 1;
        System.out.println(result);
        int chislo3 = Integer.valueOf(chislo2);
        System.out.println(chislo3 + 2);

        int summa = 0;
        for (int i = 0; i < chislo2.length() ; i++) {
            summa = summa + Integer.valueOf(chislo2.charAt(i));
        }
        System.out.println(summa);
    }
}
