package org.example;

public class InterestingNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 2019; i++) {
            if (containsInterestingDigits(i)) {
                sum += i;
            }
        }
        System.out.println("在 1 到 2019 中所有包含 2、0、1、9 的数字的和是：" + sum);
    }

    private static boolean containsInterestingDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 2 || digit == 0 || digit == 1 || digit == 9) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
