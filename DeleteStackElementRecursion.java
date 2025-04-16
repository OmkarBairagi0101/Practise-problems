import java.util.*;


//Question :
// delete middle element in stack using recursion
public class Solution {

    public static void deleteMiddle(Stack<Integer> stack, int k){
        if(k==1){
            stack.pop();
            return;
        }
        int top = stack.pop();
        deleteMiddle(stack, --k);
        stack.push(top);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(-11);
        stack.push(-2);
        stack.push(-5);
        deleteMiddle(stack, stack.size()/2+1);
        System.out.println(stack);

    }
}
