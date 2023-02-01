package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static void main(String[] args) {
        int arr[] = {73, 74, 75, 71, 69, 72, 76, 73};
        Arrays.stream(DailyTemperatureSolution(arr)).forEach(System.out::println);
    }

    public static int[] DailyTemperatureSolution(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {

            while (!stack.isEmpty() && temp[stack.peek()] < temp[i]) {
                int j = stack.pop();
                arr[j] = i - j;
            }
            stack.push(i);
        }
        return arr;
    }


}
