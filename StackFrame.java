package Mentee;

import java.util.*;
public class StackFrame {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
