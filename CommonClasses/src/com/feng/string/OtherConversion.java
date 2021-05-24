package com.feng.string;

public class OtherConversion {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = s1.toCharArray();
        System.out.println(s1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n------------------------");
//        char[] arr2 = new char[]{1,2,3,4,5};
        char[] arr2 = {1,2,3,4,5};
//        char[] arr3 = new char[]{'a','b','c','d','e'};
        char[] arr3 = {'a','b','c','d','e'};
        String s2 = new String(arr2);
//        String s3 = arr3.toString();
        String s3 = new String(arr3);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("------------------------ ");
//        char[] arr4 = {"abc"};
    }
}
