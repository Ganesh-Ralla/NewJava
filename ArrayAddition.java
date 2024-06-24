package practisejava;
import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2]; // Resultant matrix
        int i, j;
        Scanner sc = new Scanner(System.in);
        
        // Input for matrix A
        System.out.println("Enter A matrix elements");
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        // Input for matrix B
        System.out.println("Enter B matrix elements");
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        // Printing matrix A
        System.out.println("Matrix A:");
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        // Printing matrix B
        System.out.println("Matrix B:");
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        // Adding matrices A and B to form matrix C
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        // Printing resultant matrix C
        System.out.println("Resultant Matrix C (A + B):");
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
