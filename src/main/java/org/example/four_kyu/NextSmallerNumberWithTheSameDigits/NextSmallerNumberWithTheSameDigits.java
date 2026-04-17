package org.example.four_kyu.NextSmallerNumberWithTheSameDigits;

import java.util.Arrays;

public class NextSmallerNumberWithTheSameDigits {
    public static long nextSmaller(long n) {
        long start = n;
        int count = String.valueOf(n).length();
        int[] array = new int[count];

        for(int i = count - 1; i >= 0; i--) {
            int current = (int) (n % 10);
            array[i] = current;
            n /= 10;
        }
        int actualPosition = array.length -1;
        while (actualPosition > 0) {
            int positionForSwapLeft = searchGoingFromRightToLeftAndFindNumberEachHasMinNumberRight(array, actualPosition);
            if (positionForSwapLeft == -1) return -1;
            int positionForSwapRight = searchGoingFromLeftToRightAndFindNumberEachMoreNumberLeft(array, positionForSwapLeft);
            if (positionForSwapRight == -1) {
                actualPosition = positionForSwapLeft;
                continue;
            }

            int current = array[positionForSwapLeft];
            array[positionForSwapLeft] = array[positionForSwapRight];
            array[positionForSwapRight] = current;
            array = sortedAfterRightPositionForSwap(array, positionForSwapLeft);
            break;
        }
        long result = 0;

        for (int digit : array) {
            result = result * 10 + digit;
        }
        return result == start ? -1 : result;
    }

    private static int searchGoingFromRightToLeftAndFindNumberEachHasMinNumberRight(int[] array, int start){
        int min = array.length - 1;
        for(int i = start; i >= 0; i--){
            if (array[i] >  array[min]){
                return i;
            }
            if (array[min] > array[i]) min = i;
        }
        return -1;
    }

    private static int searchGoingFromLeftToRightAndFindNumberEachMoreNumberLeft(int[] array, int position) {
        int max = -1;

        for (int i = position + 1; i < array.length; i++) {
            if (array[i] < array[position]) {
                if (position == 0 && array[i] == 0) {
                    continue;
                }

                if (max == -1 || array[i] > array[max]) {
                    max = i;
                }
            }
        }

        return max;
    }

    private static int[] sortedAfterRightPositionForSwap(int[] array, int position){
        Arrays.sort(array, position + 1, array.length);

        int left = position + 1;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

}
