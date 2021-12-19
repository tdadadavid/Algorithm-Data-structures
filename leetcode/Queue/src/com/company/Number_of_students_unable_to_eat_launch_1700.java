package com.company;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Number_of_students_unable_to_eat_launch_1700 {

    public static void main(String[] args) {
        Queue<Integer> students = new ArrayDeque<>();
        students.offer(0);
        students.offer(1);
        students.offer(0);
        students.offer(1);
        students.offer(0);

        Stack<Integer> sandwiches = new Stack<>();
        sandwiches.push(0);
        sandwiches.push(1);
        sandwiches.push(0);
        sandwiches.push(1);
        sandwiches.push(1);

        int size = 0;


        while (!students.isEmpty()){ // while the student queue is not empty
            Object[] prevStudentList = students.toArray();
            Object[] currentStudentList;

            int student = students.peek();                      // the student at the front of the queue
            int sandwich = sandwiches.peek();                   // the sandwich at the top

            if (student == sandwich) {                          // if the student wants the sandwich at the top
                students.poll();                                // remove the student from the queue
                sandwiches.pop();                               // remove the sandwich from the stack
            }
            else {                                              // if the student doesn't want the sandwich at the top
                students.offer(students.poll());                // let the student go to the back
            }

            currentStudentList = students.toArray();

            for (int i = 0; i <= currentStudentList.length - 1; i++) {
                if (prevStudentList.length == currentStudentList.length) {
                    if (prevStudentList[i] == currentStudentList[i]) {
                        break;
                    }
                    break;
                }
            }


            // the problem now
            // 1. tag the student who has been at the front before
            // 2. keep track of the list

            size++;
        }

    }




    /*  students and sandwich Explanation

        0 => circular sandwich
        1 = square sandwich

        (a)
        students = [ 0 , 1, 0 , 1 , 0] -> queue
        sandwiches = [1 , 1, 0 , 1 , 0] -> stack

        first-pass:     students = [1, 0 , 1 , 0 , 1], sandwiches = [1, 1, 0, 1, 0]
        second-pass:    students = [0 , 1 ,0 , 1] , sandwiches = [1 , 0 , 1 , 0]
        third-pass:     students = [1 , 0 , 1 , 0] , sandwiches = [1 , 0 , 1, 0]
        from the third pass we see that every student will eat

        (b)
        students = [1,1,1,0,0,1]
        sandwiches = [1,0,0,0,1,1]

        first-pass:     students = [1,1,0,0,1] , sandwiches = [0,0,0,1,1]
        second-pass:    students = [1,0,0,1,1] , sandwiches = [0,0,0,1,1]
        third-pass:     students = [0,0,1,1,1] , sandwiches = [0,0,0,1,1]
        fourth-pass:    students = [0,1,1,1] , sandwiches = [0,0,1,1]
        fifth-pass:     students = [1,1,1]  , sandwiches = [0,1,1]
        from the fifth pass we see that three students will not eat. (not 1)

        result is 2 student did not eat

        1. create an identifier for those who have interfaced with the snadwiches before
    */
}
