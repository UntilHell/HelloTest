package main;

import com.datastructure.Array;
import com.datastructure.ArrayStack;

public class Main {
    public static void main(String[] args) {
       /* Array<Integer> arr =new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-7);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(8);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);*/

        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);

        }
        stack.pop();
        System.out.println(stack);
    }
}
