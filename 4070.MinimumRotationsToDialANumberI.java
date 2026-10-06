class Solution {
    public int minRotations(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            b = Integer.parseInt(s.substring(i, i + 1));
            
            if(a != b) {
                c = Math.abs(a - b);
                if(c > 5) {
                    c = 10 - c;
                }
                count += c;
            }

            a = b;
        }
        
        return count;
    }
}