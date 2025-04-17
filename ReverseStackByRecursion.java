import java.util.*;


//Question :
// delete middle element in stack using recursion
public class Solution {

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty() || stack.size() == 1){
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insert(stack, top);
    }

    public static void insert(Stack<Integer> stack, int top){
        if(stack.isEmpty()){
            stack.push(top);
            return;
        }

        int top1 = stack.pop();
        insert(stack, top);
        stack.push(top1);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack + "\nAfter reversal");
        reverse(stack);
        System.out.println(stack);

    }
}
