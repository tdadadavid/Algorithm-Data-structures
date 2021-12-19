package com.company;


public class recursive {
    public static void main(String[] args) {
        int[] pancakes = {1, 0, 1, 0, 0};
        int[] students = {0, 1, 1, 0, 1};
        int numOfStudentsLeft = getNumberOfStudentsLeft(pancakes, students);
        String outputStr = "The number of student's left is " + numOfStudentsLeft + ".";
        System.out.println(outputStr);
    }

    private static int getNumberOfStudentsLeft(int[] pancake, int[] students) {
        int [][] response = getNewSet(pancake, students, students.length);
        int[] newPancakeList = response[0];
        int[] newStudentList = response[1];
        int newStudentListLength = newStudentList.length;
        int oldStudentListLength = students.length;
        if (newStudentListLength == oldStudentListLength) {
            return newStudentListLength;
        } else {
            return getNumberOfStudentsLeft(newPancakeList, newStudentList);
        }
    }

    private static int[][] getNewSet(int[] pancake, int[] students, int counter) {
        int[] pancakeTail = removeFirst(pancake);
        int[] studentsTail = removeFirst(students);
        if (counter == 0) {
            int[][] returnVal = {pancake, students};
            return returnVal;
        } else if (pancake[0] == students[0]) {
            return getNewSet(pancakeTail, studentsTail, counter - 1);
        } else {
            int[] newPancake = shiftBy1(pancake);
            int[] newStudents = shiftBy1(students);
            return getNewSet(newPancake, newStudents, counter - 1);
        }
    }

    private static int[] removeFirst(int[] list) {
        int len = list.length;
        int[] newList = {};
        for( int i = 1; i < len; i++) {
            newList[i] = list[i - 1];
        }
        return newList;
    }

    private static int[] shiftBy1(int[] array){
        return  array;
    }
}

