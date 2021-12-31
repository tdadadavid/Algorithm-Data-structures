package com.company;

import java.util.Arrays;

public class Number_of_students_unable_to_eat_launch_2_1700 {

    public static void main(String[] args){

        int[] students = {1 , 0 , 0 , 1};   // 1, 0 , 0, 1
        int[] sandwich = {0 , 1 , 0 , 1};   //  0 , 1 , 0 , 1

        int result = getNoOfStudentsLeft(students , sandwich);
        System.out.println(result + " left");
    }

    private static int getNoOfStudentsLeft(int[] students , int[] sandwich){

        int[] studentsNow = {};
        int[] studentsThen = {};

        int remainingStudent = 0;

        for (int i = 0; i <= students.length -1;) {

            if (students[i] == sandwich[i]) {

                students = shiftLeft(students);
                sandwich = shiftLeft(sandwich);
            }
            else {

                studentsThen = students;
                students = goToTheBack(students);
                studentsNow = students;

                if (Arrays.equals(studentsNow , studentsThen)) {
                    remainingStudent = studentsNow.length;
                    return remainingStudent;
                }

            }
        }

        return  remainingStudent;
    }

    private static int[] shiftLeft(int[] values){

        int[] newValues = new int[values.length-1];

        copyIntoNewArray(values , newValues);


        return newValues;
    }

    private static int[] goToTheBack(int[] students){

        int firstStudent = students[0];

        int[] newOrderOfStudents = new int[students.length];

        copyIntoNewArray(students , newOrderOfStudents);

        newOrderOfStudents[students.length-1] = firstStudent;

        return  newOrderOfStudents;
    }

    private static void copyIntoNewArray(int[] values, int[] newValues) {

        int index = 0;
        int len = values.length -1;

        for (int i = 0; i <= len; i++){

            if (index < len){

                newValues[i] = values[index + 1];

                index++;
            }

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

        result is 3 student did not eat
    */


}
