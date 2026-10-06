class Solution {
    public int[] plusOne(int[] digits) {
        boolean overFlow = false;
        int i = digits.length - 1;
        int[] result = new int[i + 1];
        int[] newA = new int[i + 2];

        while (i >= 0) {
            int num = digits[i];
            if (i == digits.length - 1 || overFlow) {
                num += 1;
                overFlow = false;
            }
            if(num == 10){
                num -= 10;
                overFlow = true;
            }
            result[i] = num;
            i--;
        }

        while(i >= 0) {
            result[i + 1] = digits[i];
            i--;
        }

        if(overFlow) {
            newA[0] = 1;
            for(int j = 1; j < digits.length; j++) {
                newA[j] = result[j - 1];
            }
            return newA;
        }

        return result;
    }
}