package Medium;

import java.util.Arrays;

class Maximum_subarray_sum {
    int[] array;

    Maximum_subarray_sum(int[] array) {
        this.array = array;
        findMaxSubarray();
    }

    void findMaxSubarray() {
        int current_sum = array[0];
        int max_sum = array[0];
        int start = 0, end = 0, temp_start = 0;

        for (int j = 1; j < array.length; j++) {
            if (array[j] > current_sum + array[j]) {
                current_sum = array[j];
                temp_start = j;
            } else {
                current_sum += array[j];
            }

            if (current_sum > max_sum) {
                max_sum = current_sum;
                start = temp_start;
                end = j;
            }
        }

       
        System.out.println("Maximum Subarray Sum: " + max_sum);
        System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(array, start, end + 1)));
    }
}

class Maximum_subarray {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 5, -1, 2};
        new Maximum_subarray_sum(array);
    }
}
