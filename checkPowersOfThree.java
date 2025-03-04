public class checkPowersOfThree {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        checkPowersOfThree sol = new checkPowersOfThree();
        int testNumber = 91; // 91 = 3^4 + 3^3 + 3^0
        boolean result = sol.checkPowersOfThree(testNumber);
        System.out.println("Can " + testNumber + " be represented as a sum of powers of three? " + result);
    }
}
