package com.utils;

import java.util.*;

/**
 * 吸血鬼数字
 * @author zlp
 * @date 14:41  2019/10/24
 */
public class xxg {


    static int a(int i) {
        return i / 1000;
    }

    static int b(int i) {
        return (i % 1000) / 100;
    }

    static int c(int i) {
        return ((i % 1000) % 100) / 10;
    }

    static int d(int i) {
        return ((i % 1000) % 100) % 10;
    }

    static int com(int i, int j) {
        return (i * 10) + j;
    }

    static void productTest(int i, int m, int n) {
        int count = 0;
        if (m * n == i) {
            count++;
            System.out.println(i + " = " + m + " * " + n);
            System.out.println(count);
        }
    }

    public void test() {
        for (int i = 1001; i < 9999; i++) {
            productTest(i, com(a(i), b(i)), com(c(i), d(i)));
            productTest(i, com(a(i), b(i)), com(d(i), c(i)));
            productTest(i, com(a(i), c(i)), com(b(i), d(i)));
            productTest(i, com(a(i), c(i)), com(d(i), b(i)));
            productTest(i, com(a(i), d(i)), com(b(i), c(i)));
            productTest(i, com(a(i), d(i)), com(c(i), b(i)));
            productTest(i, com(b(i), a(i)), com(c(i), d(i)));
            productTest(i, com(b(i), a(i)), com(d(i), c(i)));
            productTest(i, com(b(i), c(i)), com(d(i), a(i)));
            productTest(i, com(b(i), d(i)), com(c(i), a(i)));
            productTest(i, com(c(i), a(i)), com(d(i), b(i)));
            productTest(i, com(c(i), b(i)), com(d(i), a(i)));
        }
    }

    public void testXXG(int num) {
        //num 为偶数
        int sum = 0;
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        double start = Math.pow(10, num / 2 - 1);
        for (int num1 = (int) start; num1 < num1 * 10; num1++) {
            for (int num2 = num1; num2 < num1 * 10; num2++) {
                int prduct = num1 * num2;
                for (int i = 0; i < num; i++) {
//                    arr1[i] = ;
//                    arr1[i] = ;
                }
            }
        }
    }

    public void testFuck() {
//        Map<String, String> map = testXiXueGuiSix();
        Map<String, String> map = new HashMap();
        map.toString();
        Map<String, String> mapBak = new HashMap();
        mapBak.putAll(map);
        List list = xxg(6);
        for (int i = 1; i <= map.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                String mapStr = map.get(String.valueOf(i));
                String listStr = String.valueOf(list.get(j));
                if (mapStr.equals(listStr)) {
                    mapBak.remove(String.valueOf(i));
                }
            }
        }
        System.out.println("-==--=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println(mapBak.size());
        System.out.println(mapBak.toString());

    }

    private static List xxg(int n) {
        HashSet<Integer> integers = new HashSet<Integer>();
        int bit = n / 2;
        int begin = (int) Math.pow(10, bit - 1);
        int end = (int) Math.pow(10, bit);
        List solutions = new ArrayList<Integer>();
        for (int i = begin; i < end; i++) {
            for (int j = i; j < end; j++) {
                if (isXxg(n, i, j, i * j)) {
                    solutions.add(i * j);
                    integers.add(i * j);
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        }
        System.out.println("Set:" + integers.size());
        return solutions;
    }

    private static boolean isXxg(int n, int i, int j, int result) {
        int tempResult = result;
        int tempI = i;
        int tempJ = j;

        if (result <= (int) Math.pow(10, n - 1) || result >= (int) Math.pow(10, n)) {
            return false;
        }
        if (i % 100 == 0 || j % 100 == 0 || result % 100 == 0) {
            return false;
        }
        int[][] arr = new int[n][2];
        for (int k = n - 1; k >= 0; k--) {
            arr[k][0] = tempResult % 10;
            arr[k][1] = -1;
            tempResult = tempResult / 10;
        }
        int[][] arrI = new int[n / 2][2];
        for (int k = n / 2 - 1; k >= 0; k--) {
            arrI[k][0] = tempI % 10;
            arrI[k][1] = -1;
            tempI = tempI / 10;
        }
        int[][] arrJ = new int[n / 2][2];
        for (int k = n / 2 - 1; k >= 0; k--) {
            arrJ[k][0] = tempJ % 10;
            arrJ[k][1] = -1;
            tempJ = tempJ / 10;
        }
//        for (int i1 = 0; i1 < arr.length; i1++) {
//            for (int i2 = i1; i2 < arrI.length; i2++) {
//                if (arrI[])
//            }
//            for (int i2 = 0; i2 < arrJ.length; i2++) {
//
//            }
//        }
        for (int[] ints : arr) {
            for (int[] i1 : arrI) {
                if (i1[0] == ints[0] && ints[1] != 0 && i1[1] != 0) {
                    ints[1] = 0;
                    i1[1] = 0;
                    continue;
                }

            }
            for (int[] i1 : arrJ) {
                if (i1[0] == ints[0] && ints[1] != 0 && i1[1] != 0) {
                    ints[1] = 0;
                    i1[1] = 0;
                    continue;
                }
            }
        }
        for (int[] ints : arr) {
            if (ints[1] != 0) {
                return false;
            }
        }

        return true;
    }


    public void testXiXueGuiSix() {
        long start = System.currentTimeMillis();
        Map<String, String> map = new HashMap();
        int sum = 0;
        int[] arr1 = new int[6];
        int[] arr2 = new int[6];
        for (int num1 = 100; num1 < 1000; num1++) {
            for (int num2 = num1; num2 < 1000; num2++) {
                int product = num1 * num2;
                if (product < 100000) {
                    continue;
                }
                arr1[0] = num1 / 100;
                arr1[1] = num1 % 100 / 10;
                arr1[2] = num1 % 100 % 10;
                arr1[3] = num2 / 100;
                arr1[4] = num2 % 100 / 10;
                arr1[5] = num2 % 100 % 10;

                arr2[0] = product / 100000;
                arr2[1] = product % 100000 / 10000;
                arr2[2] = product % 100000 % 10000 / 1000;
                arr2[3] = product % 100000 % 10000 % 1000 / 100;
                arr2[4] = product % 100000 % 10000 % 1000 % 100 / 10;
                arr2[5] = product % 100000 % 10000 % 1000 % 100 % 10;

                int same = 0;
                for (int x = 0; x < 6; x++) {
                    for (int y = 0; y < 6; y++) {
                        if (arr2[x] == arr1[y]) {
                            same++;
                            arr2[x] = -1;
                            arr1[y] = -2;
                            if (same == 6) {
                                sum++;
                                map.put(String.valueOf(sum), String.valueOf(product));
                                System.out.println(map.size());
                                System.out.println("sum : " + sum);
                                System.out.println(num1 + " * " + num2 + " = " + product);
                            }
                        }
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("消费时间" + (end - start));
//        return map;
    }

    public void testXiXueGuiFour() {
        int sum = 0;
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        for (int num1 = 10; num1 < 100; num1++) {
            for (int num2 = num1; num2 < 100; num2++) {
                int product = num1 * num2;
                if (product % 1000 == 0 && product / 10 % 100 == 0) {
                    continue;
                }
                arr1[0] = num1 / 10;
                arr1[1] = num1 % 10;
                arr1[2] = num2 / 10;
                arr1[3] = num2 % 10;

                arr2[0] = product / 1000;
                arr2[1] = product % 1000 / 100;
                arr2[2] = product % 1000 % 100 / 10;
                arr2[3] = product % 1000 % 100 % 10;

                int same = 0;
                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        if (arr2[x] == arr1[y]) {
                            same++;
                            arr1[y] = -2;
                            arr2[x] = -1;
                            if (same == 4) {
                                sum++;
                                System.out.println("sum : " + sum);
                                System.out.println(num1 + " * " + num2 + " = " + product);
                            }
                        }
                    }
                }
            }
        }

    }
}
