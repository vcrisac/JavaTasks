package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CharList {
    private List<Character> charList;

    CharList(){
        charList = new ArrayList<>();
    }

    public CharList (String inputString){
        char[] chars = inputString.toCharArray();
        charList = new ArrayList<>();
        for (int i = 0; i < chars.length ; i++) {
            charList.add(chars[i]);
        }
    }

    public CharList(List<Character> charList) {
        this.charList = charList;
    }

    public void setCharList(List<Character> charList){
        this.charList = charList;
    }

    public List<Character> getCharList() {
        return charList;
    }

    @Override
    public String toString() {
        return ""+charList;
    }

//    List<Character> convertStringToCharList(String str){
//        charList = new ArrayList<>();
//        for (char chr : str.toCharArray() ){
//            charList.add(chr);
//        }
//        return charList;
//    }

//     List<Character> charListLength(){
//        charList.size();
//    }

    // get character at the specified index
    char charAt(int index){
        try {
            return charList.get(index);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("You entered wrong index!");
        }
        return ' ';
    }

    // get the index of specified character
    int indexOf(char ch){
        return charList.indexOf(ch);
    }

    int lenght(){
        return charList.size();
    }
    // get the substring
    List<Character> subString(int start, int end){
        return charList.subList(start, end);
    }

     // remove duplicates - distinct
    List<Character> removeDuplicates(){
        return charList.stream().distinct().collect(Collectors.toList());
    }

    // removeFirst
    List<Character> removeFirst(Character ch){
        charList.remove(ch);
        return charList;
    }

    // removeAll
    List<Character> removeAll(Character ... c){
        charList.removeAll(Arrays.asList(c));
        return charList;
    }

    // is empty
    boolean isEmpty(){
        return charList.isEmpty();
    }

    //contains
    boolean contains(Character c){
        return charList.contains(c);
    }

    // clear list
    List<Character> clearList(){
         charList.clear();
         return new ArrayList<>(charList);
    }

    // sort list
    List<Character> sortList(){
        List<Character> newCharList = new ArrayList<>(charList);
        Collections.sort(newCharList);
        return newCharList;
    }

    // reverse list
    List<Character> reverseList(){
        List<Character> newCharList = new ArrayList<>(charList);
        Collections.reverse(newCharList);
        return newCharList;
    }

    // mixed list
    List<Character> mixedList(){
        List<Character> newCharList = new ArrayList<>(charList);
        Collections.shuffle(newCharList);
        return newCharList;
    }





}
