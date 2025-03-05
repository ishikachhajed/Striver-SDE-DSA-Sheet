import java.util.Scanner;

public class coloredCells {
    public long coloredCells(int n) {
        return 1 + (long) n * (n - 1) * 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        coloredCells solution = new coloredCells();
        long result = solution.coloredCells(n);
        
        System.out.println("Number of colored cells: " + result);
    }
}

