
class Solution {
    public String toHex(int num) {

        if(num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();
        String result = "";

        long n = num;

        if(n < 0) {
            n = n + 4294967296L;
        }

        while(n > 0) {
            int remainder = (int)(n % 16);

            result = hex[remainder] + result;

            n = n / 16;
        }

        return result;
    }
}
