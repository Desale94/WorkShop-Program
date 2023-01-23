package com.bridglabz.array;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int [n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<=n-2; i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=(n*(n+1))/2;
        int sumArray=0;
        for (int i=0; i<=n-2; i++){
            sumArray=sumArray+arr[i];

        }
        int missingNumber=sum-sumArray;
        System.out.println("Missing number: " +missingNumber);
    }
}