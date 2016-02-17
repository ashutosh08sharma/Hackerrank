package com.cloudera.test;

public class StackMachine {
	private int maxSize;
    private int[] stack;
    private int top;
    public StackMachine(int s) {
       maxSize = s;
       stack = new int[maxSize];
       top = -1;
    }
    public void push(int j) {
       stack[++top] = j;
    }
    public int pop() {
       return stack[top--];
    }
    public int peek() {
       return stack[top];
    }
    public boolean isEmpty() {
       return (top == -1);
    }
    public boolean isFull() {
       return (top == maxSize - 1);
    }

 public static void main(String[] args) {
     // TODO Auto-generated method stub
     // you can also use imports, for example:
     // import java.util.*;

     // you can write to stdout for debugging purposes, e.g.
     // System.out.println("this is a debug message");
     int ans = solution("13+62*7+*");
     System.out.println(ans);

 }

 public static int solution(String S) {
     //int top = 0;
     // write your code in Java SE 8
     //int stack[] = new int[S.length()];
     StackMachine sm = new StackMachine(S.length());
     for (int i = 0; i < S.length(); i++) {
         //stack[i] = S.charAt(i);
         
         
         
         if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
             sm.push(Character.getNumericValue(S.charAt(i)));
         } else {
             switch (S.charAt(i)) {
             case '+':
                 int a = sm.pop();
                 int b = sm.pop();
                 int c = a+ b;
                 sm.push(c);
                 break;
             case '*':
                 int x = sm.pop();
                 int y = sm.pop();
                 int z = x * y;
                 sm.push(z);
                 break;
             }
         }

     }
     return sm.peek();

 }

}
