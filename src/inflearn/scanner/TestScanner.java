package inflearn.scanner;

import java.util.Scanner;

public class TestScanner {
    
    private Scanner sc = new Scanner(System.in);
    private int n;
    private int[] input;
    
    public TestScanner(){
        n = sc.nextInt();
        input = new int[n];
        initializeArray();
    }

    private void initializeArray() {
        for (int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }
    }

    public int getN() {
        return n;
    }

    public int[] getInput() {
        return input;
    }
}
