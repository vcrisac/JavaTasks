package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int charAtIndex = 1;
        char ch = '1';
        CharList charList = new CharList("acb123123");
        System.out.println("CharList is: " + charList);
        System.out.println("Char at index "+ charAtIndex +": "+ charList.charAt(charAtIndex));
        System.out.println("Index of char '" + ch + "' is : " + charList.indexOf(ch));
        System.out.println("Length of CharList is: " + charList.lenght());
        System.out.println("Substring: " + charList.subString(3,5));
        System.out.println("Remove duplicates: " + charList.removeDuplicates());
        System.out.println("Is CharList empty: " + charList.isEmpty());
        System.out.println("Contains: " + charList.contains('f'));
        System.out.println("Contains: " + charList.contains('a'));
        System.out.println("Sort List: " + charList.sortList());
        System.out.println("Reverse List: " + charList.reverseList());
        System.out.println("Mixed List: " + charList.mixedList());
        System.out.println("Remove char: " + charList.removeFirst('1'));
        System.out.println("Remove All: " + charList.removeAll('3', '1'));
        System.out.println("Cleared list: " + charList.clearList());

    }
}
