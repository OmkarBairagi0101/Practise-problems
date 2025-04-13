import java.util.Stack;

public class Practise {

    public static int getSmallestNumberFromPattern(String str){
        int ans = 0, j=1;
        Stack<Integer> stack  = new Stack<>();

        if(str.length() < 1 || str.length() > 8){
            return -1;
        }
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i) == 'M'){
                stack.push(j++);
            } else if(str.charAt(i) == 'N'){
                stack.push(j++);
                while(!stack.isEmpty()){
                    ans = ans * 10 + stack.pop();
                }
            }
        }
        stack.push(j++);
        while(!stack.isEmpty()){
            ans = ans * 10 + stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("NNNNNM");
        System.out.println(getSmallestNumberFromPattern("NNNNNM"));
    }
}
