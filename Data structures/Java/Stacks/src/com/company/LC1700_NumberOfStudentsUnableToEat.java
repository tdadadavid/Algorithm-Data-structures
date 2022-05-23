package com.company;

public class LC1700_NumberOfStudentsUnableToEat {
    public int countStudents(int[] students, int[] sandwiches) {

        int[] count = {0 ,0};

        for(int n : students) count[n]++;

        int i = 0;

        while(i < students.length && count[sandwiches[i]] > 0){
            count[sandwiches[i]]--;
            i++;
        }

        return (students.length - i);
    }

    public int countStudents2(int[] students, int[] sandwiches){
        // first element is for circular sandwich
        // second element is for square sandwich.

        int[] studentsSandwichesCount = {0, 0};

        for(int student : students) studentsSandwichesCount[student]++;

        int studentPointer = 0;

        // while there are still students and those students wants the
        // available sandwich then give to the current student.
        while (studentPointer < students.length && studentsSandwichesCount[sandwiches[studentPointer]] > 0){
            studentsSandwichesCount[sandwiches[studentPointer]]--;
            studentPointer++;
        }

        return students.length - studentPointer;
    }

     /*
      * Count the number of students who wants
      * each kind of sandwich (square or circular).
      * for each sandwich check the type of
      * sandwich given, then check if the number of
      * students that want that sandwich is greater than zero ?
      * (because if it's not then there is no student that wants that kind of sandwich)
      * if this is true, give one out of those students the top sandwich. else return
      * the number of students who don't want the current kind of sandwich.
      */

    public int countStudent3(int[] students, int[] sandwiches){

        int numOfCircularSandwichStudent = 0;
        int numOfSquareSandwichStudent = 0;

        final int CIRCULAR_SANDWICH  = 0;

        for (int studentDesires : students){
            if (studentDesires == CIRCULAR_SANDWICH) numOfCircularSandwichStudent++;
            else numOfSquareSandwichStudent++;
        }

        for (int typeOfSandwich: sandwiches){

            if (typeOfSandwich == CIRCULAR_SANDWICH){
                if (numOfCircularSandwichStudent == 0) return numOfSquareSandwichStudent;
                else numOfCircularSandwichStudent--;
            }else{
                if (numOfSquareSandwichStudent == 0) return numOfCircularSandwichStudent;
                else numOfSquareSandwichStudent--;
            }
        }

        return 0;
    }

}
