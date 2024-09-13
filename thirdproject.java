class thirdproject {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int num1 = 0, num2 = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            // Calculate the next term
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}