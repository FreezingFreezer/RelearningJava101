public class PracticeProblems {
    public static int countOccurances(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
}
public static int[] reverseArray(int[] arr){
    int[] reversed = new int[arr.length];
    for (int i = 0; i <arr.length; i++){
        int x = arr.length-1-i;
        reversed[x] = arr[i];
    }
    return reversed;
}
public static int sumOfArray(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
        }
    }
    return sum;
}
public static int[] fib(int[] arr){
    int[] fibArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] <= 1){
            if (arr[i] == 0) {
                fibArr[i] = 0;
            } else if (arr[i] == 1) {
                fibArr[i] = 1;
            }
        }
        if (arr[i] > 1){
            fibArr[i] = arr[i]-1 + arr[i]-2;
        }
    }
    return fibArr;
}
}