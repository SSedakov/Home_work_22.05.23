package org.example;

public abstract class StringTools {
    /*
    Создайте абстрактный класс StringTools, со статическими методами:
    String FirstToUpperCase(String str);
Данный метод должен возвращать новую строку, в которой первый символ возведен в верхний регистр.
Например, FirstToUpperCase("apple") -> "apple';

boolean isStartingFromCapital(String str); Данный метод должен показывать, начинается ли строка с большой буквы.
Например, isStartingFromCapital("Apple") -> true;
isStartingFromCapital("apple") -> false;
     */
    public static String FirstToUpperCase(String str){
       return str.substring(0,1).toUpperCase() + str.substring(1);
    }
    public static boolean isStartingFromCapital(String str){
        if (Character.isUpperCase(str.charAt(0))){
            return true;
        }
        return false;
    }
}
