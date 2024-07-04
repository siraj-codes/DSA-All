// package Linear_Search_Algorithm;

// public class LS12 {
// // Number of Even digits of a number in an array
// static int Linear_Search_Algorithm12(int[] arr) {

// int count = 0;

// for (int num : arr) {

// countDigit(num);

// if (countDigit(num) % 2 == 0) {

// count++;

// }

// }

// return count;
// }

// static int countDigit(int n) {

// // int count = 0;

// // if number is -ve make it positive
// // if (n < 0) {
// // n = n * -1;
// // }

// // while (n > 0) {
// // count++;
// // n = n / 10;
// // }

// // other way where I donot have to tell if number is -ve make it positive

// // while (n != 0) {
// // count++;
// // n = n / 10;
// // }

// if (n < 0) {

// n = n * -1;

// }

// if (n == 0) {
// return 1;
// }

// // other way as well :)

// less time taken here
// return (int) (Math.log10(n));
// // return count;

// }

// }
