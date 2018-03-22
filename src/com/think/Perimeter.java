package com.think;


import java.util.Random;

/**
 * @author Roman Vyhovskyi
 */
public class Perimeter {
    public static void main(String[] args) {
        Integer[][] array = matrixGenerator();
        printArray(array);
        //printPerimeter(array);
        printPerimeter1(array);
    }

    public static Integer[][] matrixGenerator() {
        Random random = new Random();
        Integer[][] array = new Integer[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(9);
        }
        return array;
    }

    public static void printArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void printPerimeter(Integer[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    System.out.print(array[i][j] + " ");
                }
                if (i > 0 & i != array[i].length - 1 & j == array[j].length - 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (i == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                }
                if (i < array.length - 1 & i != 0 & j == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
    public static void printPerimeter1(Integer[][] array) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        for (int i = 0; i < array[0].length; i++) {
            b.append(array[0][i]);
            b.append(" ");

            d.append(array[array.length - 1][array[0].length - 1 - i]);
            d.append(" ");
            if (i != 0 && i < array.length - 1) {
                c.append(array[i][array[0].length - 1]);
                c.append(" ");

                a.append(array[array.length - 1 - i][0]);
                a.append(" ");
            }
        }
        System.err.println(b.toString() + c.toString() + d.toString() + a.toString());
    }
}
