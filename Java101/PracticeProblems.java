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
}