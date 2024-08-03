package appsongproject;

import java.util.Scanner;

public class MovingAverage {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter an number");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int K = scanner.nextInt();
        double[] smoothedArray = calculateMovingAverage(arr, K);
        
        if (smoothedArray != null) {
            for (double num : smoothedArray) {
                System.out.printf("%.2f ", num);
            }
        } else {
            System.out.println("-1");
        }
    }
    
    public static double[] calculateMovingAverage(int[] arr, int K) {
        if (arr.length < K) {
            return null;
        }
        
        double[] smoothedArray = new double[arr.length - K + 1];
        double sum = 0;
        
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        
        smoothedArray[0] = sum / K;
        
        for (int i = K; i < arr.length; i++) {
            sum += arr[i] - arr[i - K];
            smoothedArray[i - K + 1] = sum / K;
        }
        
        return smoothedArray;
    }
}


