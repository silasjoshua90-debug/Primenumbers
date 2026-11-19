class PrimeChecker {
    public static void main(String[] args) {
        int limit = 500;
        boolean[] isPrime = new boolean[limit + 1];

        // Assume all numbers from 2 up are prime
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Mark multiples of each prime as not prime
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print the primes
        System.out.println("Prime numbers between 0 and " + limit + ":");
        int count = 0;
        for (int i = 0; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n\nTotal primes found: " + count);
    }
}