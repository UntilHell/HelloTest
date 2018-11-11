package main;

import com.datastructure.Array;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s,score: %d",name,score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("汪航",14));
        arr.addLast(new Student("科比",23));
        arr.addLast(new Student("文涛",45));
        System.out.println(arr);



    }
}
