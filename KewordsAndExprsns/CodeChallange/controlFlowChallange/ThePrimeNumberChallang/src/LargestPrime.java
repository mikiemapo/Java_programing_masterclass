public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1; // Invalid input, 0 and 1 are not prime and negative numbers are not valid.
        }

        int largestPrime = -1; //This variable will be used to store the largest prime factor found in the number.

        // i is to find factor
        for (int i = 2; i <= number; i++) {  //loop that goes from i = 2 to i being less than or equal to number
            if (number % i == 0) { // if number is divisible by i
                boolean isPrime = true; //it means i is a factor of the number.

                // j is to find primes in factor i
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) { //isPrime is still true, it means that i is a prime number.
                    largestPrime = i; //update the largestPrime variable with the current i
                    while (number % i == 0) {
                        number /= i;
                    //divide the number by i as many times as possible to remove all
                    // occurrences of this prime factor from number. This step is necessary
                    // to find all the prime factors of number.

                    }
                }
            }
        }

        return largestPrime;
    }
}

//
//        1. Input: `getLargestPrime(10)`.
//
//        2. The code checks potential factors of `10` starting from `2` and going up to `10`.
//
//        3. It first checks `2`, and it's a factor (divisible by 2).
//
//        4. It further checks if `2` is prime by testing if it's divisible by numbers from `2` to `2-1`, which is just 1. Since it's not divisible by 1, it is considered prime.
//
//        5. So, `2` becomes the largest prime factor found so far.
//
//        6. Next, the code checks `3`, but `10` is not divisible by `3` without a remainder.
//
//        7. It checks `4`, but `10` is not divisible by `4` without a remainder either.
//
//        8. It checks `5`, and it's a factor (divisible by 5).
//
//        9. It further checks if `5` is prime by testing if it's divisible by numbers from `2` to `5-1`, which is `2, 3, and 4`. Since it's not divisible by any of these, it is considered prime.
//
//        10. `5` now becomes the largest prime factor found so far, replacing `2`.
//
//        11. Finally, the code checks `6`, `7`, `8`, `9`, and `10`, but none of these are factors of `10`.
//
//        12. The method returns `5` as the largest prime factor of `10`.
//
//        So, for `getLargestPrime(10)`, the largest prime factor is `5`, which is a prime number that can evenly divide `10` with no remainder.
//

