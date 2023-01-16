package ArraysAndHashing;

public class removeDuplicateElement {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 2, 2, 3, 4};
        System.out.println(removeDuplicateElementSolution(arr));
    }

    public static int removeDuplicateElementSolution(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        int s = 0;
        int f = 0;
        while (f < arr.length) {

            if (arr[s] != arr[f]) {
                s++;
                arr[s] = arr[f];
            }
            f++;
        }
        return s + 1;
    }

}
