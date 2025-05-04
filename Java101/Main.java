import java.util.Arrays;

public class Main {  
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 3};
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(PracticeProblems.countOccurances(arr, 3));
        System.out.println(Arrays.toString(PracticeProblems.reverseArray(arr)));
        System.out.println(PracticeProblems.sumOfArray(arr2D));
        System.out.println(Arrays.toString(PracticeProblems.fib(arr)));
    }
}