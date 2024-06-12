import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        int n = str.length();
        Main permutation = new Main();
        permutation.permute(str, 0, n - 1);
    }