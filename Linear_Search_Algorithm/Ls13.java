// package Linear_Search_Algorithm;

// public class Ls13 {
// // Who is richest
// static void Linear_Search_Algorith13(int[][] arr) {

// int W1 = 0;
// int W2 = 0;
// int W3 = 0;
// int W4 = 0;

// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {

// if (i == 0) {

// W1 += arr[i][j];

// }
// if (i == 1) {

// W2 += arr[i][j];

// }
// if (i == 2) {

// W3 += arr[i][j];

// }
// if (i == 3) {

// W4 += arr[i][j];

// }

// }
// }
// System.out.println("\t\t\n");
// System.out.println("1st person has " + W1 + " wealth\n");
// System.out.println("2nd person has " + W2 + " wealth \n");
// System.out.println("3rd person has " + W3 + " wealth\n");
// System.out.println("4th person has " + W4 + " wealth\n");

// System.out.println(Name(W1, W2, W3, W4, max_in_3(W3, W2, W1)));
// System.out.println("\t\t\n");

// }

// static int max_in_3(int n1, int n2, int n3) {

// if (n1 > n2 && n1 > n3) {

// return n1;

// }
// if (n2 > n1 && n2 > n3) {

// return n2;

// }
// if (n3 > n1 && n3 > n2) {

// return n3;

// }

// return 0;

// }

// static String Name(int W1, int W2, int W3, int W4, int max) {

// if (max == W1) {
// return "1st person is richest !!";
// }
// if (max == W2) {
// return "2nd person is richest !!";

// }
// if (max == W3) {
// return "3rd person is richest !!";

// }
// if (max == W4) {
// return "4th person is richest !!";

// }

// return "";
// }

// }
