
// // import java.util.Arrays;
// import java.util.Arrays;
// import java.util.Scanner;

// public class T_D_ARRAY {

// static void TWO_D_ARRAY() {
// // EXP_1();
// // EXP_2();
// // EXP_3();
// }

// static void EXP_1() {
// // EXAMPLE ONE OF A TWO_D ARRAY

// // Directy Giving value to a 2d array
// // int[][] T_D_ARR_1 = {

// // { 1, 2, 3 },
// // { 4, 5, 6 },
// // { 7, 8, 9 }
// // };

// // Printing value with Arrays.tostring

// // Way Number 1
// // for (int i = 0; i < T_D_ARR_1.length; i++) {

// // System.out.println(Arrays.toString(T_D_ARR_1[i]));

// // }

// // Way Number 2
// // for (int[] arr : T_D_ARR_1) {

// // System.out.println(Arrays.toString(arr));

// // }

// // Printing with for i,j loop
// // for (int i = 0; i < T_D_ARR_1.length; i++) {

// // for (int j = 0; j < T_D_ARR_1.length; j++) {
// // System.out.print(T_D_ARR_1[i][j] + " ");
// // }
// // System.out.println("\n");
// // }

// // Printing it with for_each loop
// // for (int[] row : T_D_ARR_1) {

// // for (int val : row) {

// // System.out.print(val + " ");

// // }

// // System.out.println("\n");

// // }
// }

// static void EXP_2() {
// // EXAMPLE TWO OF A TWO_D ARRAY Taking input and seeing output
// // Scanner in = new Scanner(System.in);

// // int[][] T_D_ARR_2 = new int[3][3];

// // for (int i = 0; i < T_D_ARR_2.length; i++) {
// // for (int j = 0; j < T_D_ARR_2.length; j++) {
// // System.out.print((i + 1) + "," + (j + 1) + " : ");
// // T_D_ARR_2[i][j] = in.nextInt();
// // }
// // System.out.println("\n");
// // }
// // for (int i = 0; i < T_D_ARR_2.length; i++) {
// // for (int j = 0; j < T_D_ARR_2.length; j++) {
// // System.out.print(T_D_ARR_2[i][j] + " ");
// // }
// // System.out.println("\n");
// // }
// // }
// }

// static void EXP_3() {
// // EXAMPLE THREE OF A TWO_D ARRAY

// // Directy Giving value to a 2d array of changing column
// // int[][] T_D_ARR_3 = {

// // { 1, 2, 3 },
// // { 4, 5 },
// // { 7, 8, 9, 10 }
// // };

// // Printing with for i,j loop 1.0
// // for (int i = 0; i < T_D_ARR_3.length; i++) {

// // for (int j = 0; j <= T_D_ARR_3.length; j++) {

// // try {

// // System.out.print(T_D_ARR_3[i][j] + " ");

// // } catch (Exception e) {

// // }

// // }
// // System.out.println("\n");
// // }

// // Printing with for i,j loop 2.0
// // for (int i = 0; i < T_D_ARR_3.length; i++) {

// // for (int j = 0; j < T_D_ARR_3[i].length; j++) {

// // System.out.print(T_D_ARR_3[i][j] + " ");

// // }
// // System.out.println("\n");
// // }
// }

// // static void EXP_4() {
// // // EXAMPLE TWO OF A TWO_D ARRAY Taking input and seeing output of a jageed
// // array

// // Scanner in = new Scanner(System.in);

// // int[][] T_D_ARR_2 = new int[3][];
// // T_D_ARR_2[1][2];
// // T_D_ARR_2[2][5];
// // T_D_ARR_2[3][7];

// // for (int i = 0; i < T_D_ARR_2.length; i++) {
// // for (int j = 0; j < T_D_ARR_2[i].length; j++) {
// // System.out.print((i + 1) + "," + (j + 1) + " : ");
// // T_D_ARR_2[i][j] = in.nextInt();
// // }
// // System.out.println("\n");
// // }
// // for (int i = 0; i < T_D_ARR_2.length; i++) {
// // for (int j = 0; j < T_D_ARR_2[i].length; j++) {
// // System.out.print(T_D_ARR_2[i][j] + " ");
// // }
// // System.out.println("\n");
// // }
// // in.close();
// // // }
// // }

// static void ANG2d_ARRAY() {

// String User_Info[][] = new String[2][3];
// Scanner in = new Scanner(System.in);

// for (int i = 0; i < User_Info.length; i++) {
// for (int j = 0; j < User_Info[i].length; j++) {

// User_Info[i][j] = in.nextLine();

// }
// System.out.println("\n");
// }

// for (String[] OneUserData : User_Info) {

// System.out.println(Arrays.toString(OneUserData));

// }

// in.close();

// }
// }
