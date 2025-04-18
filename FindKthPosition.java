public class FindKthPosition {

    //Question : find (N,K) th character in an grammer of following rules using recursion
    //1) Grammer starts with n=1, k=1 with element as 0
    //2) For grammer of Nth row, you have to consider N-1th row. i.e. for each 0 of N-1th row, Nth row will have 01 and for each 1 Nth row will have 10
    //3) e.g. 0                 N=1
    //        0 1               N=2
    //        0 1 1 0           N=3
    //        0 1 1 0 1 0 0 1   N=4


    // There are two methods to solve
    // 1) find the total grammer string and find Kth character implemented in generateFirst() method
    // 2) find only required number at Kth position using something cool by IBH logic as implemented in solve() mehtod


    public static int solve(int n, int k){
        if(n==1 && k==1){
            return 0;
        }
        int mid = (int)Math.pow(2, n-1)/2;
        if(k<=mid){
            return solve(n-1, k);
        } else {
            return solve(n-1, k-mid) ^ 1;
        }
    }

    public static String generateFirst(int n){
        String grammer = "";
        if(n==1){
            grammer = "0";
            return grammer;
        }

        grammer = generateFirst(n-1);

        return generateSecond(grammer);
    }

    public static String generateSecond(String grammer){
        String ans = "";
        if(grammer.length() == 0){
            return "";
        }

        if(grammer.charAt(0) == '0'){
            ans = "01";
        } else {
            ans = "10";
        }

        ans += generateSecond(grammer.substring(1, grammer.length()));

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generateFirst(1));
        System.out.println(generateFirst(2));
        System.out.println(generateFirst(3));
        System.out.println(generateFirst(4));
        System.out.println(generateFirst(5));

        System.out.println(solve(4, 8));
    }
}
