package com.dayu.day01;

// 冒泡排序
public class a02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};

        // 外循环：表示我要执行多少轮，如果有n个数据，那么执行n - 1轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环：每一轮中我如何比较数据并找到当前的最大值
            // -1：是为了防止索引越界
            // -i：是为了提高效率，每一轮执行的次数应该比上一轮少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // j依次表示数组中的每一个索引：0 1 2 3 4
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);

    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
