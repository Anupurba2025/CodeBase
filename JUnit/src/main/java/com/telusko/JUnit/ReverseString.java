package com.telusko.JUnit;

public class ReverseString {
    public String ReverseStringValue(String str){
        String newStr = "";
        for(int i = str.length()-1; i >= 0 ; i--){
            newStr = newStr.concat(String.valueOf(str.charAt(i)));
        }
        return newStr;
    }
}
