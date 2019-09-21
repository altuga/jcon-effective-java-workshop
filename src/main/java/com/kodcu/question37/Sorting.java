package com.kodcu.question37;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *  1 - How do you transform current Exception in to IndexOutOfBoundsException -
 *  Exception Translation :
 *  Convert LowerLevelException to HigherLevelException
 *
 * @param <E> Type of the Element
 *
 *  javadoc : 2
 */
public class Sorting<E> {

    private static List myList = new ArrayList();

    public E get(int index) {
        ListIterator<E> i = myList.listIterator();
        return i.next(); // 1  //3
    }

    public static void main(String[] args) {
        Sorting<String> sorting = new Sorting<String>();
        System.out.println(sorting.get(9));
    }


}
