// beats 86.42% of memory
class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> li = new ArrayList<>();
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (sum + i > s) {
                    break;
                }
                li.add(i);
                sum += i;
            }
        }
        return li;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}