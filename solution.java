Here is a Java console application that finds all permutations of a string:

```java
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

    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
```

And here is a Java console application that finds all permutations of a list of numbers:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the list:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        permute(nums, 0, n - 1);
    }

    private static void permute(int[] nums, int l, int r) {
        if (l == r)
            System.out.println(Arrays.toString(nums));
        else {
            for (int i = l; i <= r; i++) {
                swap(nums, l, i);
                permute(nums, l + 1, r);
                swap(nums, l, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```