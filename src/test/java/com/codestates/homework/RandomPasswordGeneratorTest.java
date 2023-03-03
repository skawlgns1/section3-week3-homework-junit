package com.codestates.homework;

import com.codestates.helper.RandomPasswordGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomPasswordGeneratorTest {

    static int numberOfUpperCaseLetters = 1;   //생성될 패스워드 문자열에서 알파벳 대문자의 개수
    static int numberOfLowerCaseLetters = 2;  //생성될 패스워드 문자열에서 알파벳 소문자의 개수
    static int numberOfNumeric = 3;   //생성될 패스워드 문자열에서 0 이상인 숫자의 개수
    static int numberOfSpecialChars = 4;   //생성될 패스워드 문자열에서 특수문자의 개수
    static String result = RandomPasswordGenerator.generate(numberOfUpperCaseLetters, numberOfLowerCaseLetters,
            numberOfNumeric,numberOfSpecialChars);

    @DisplayName("실습 3-1: 생성된 패스워드의 길이가 입력한 파라미터 숫자의 합과 일치하는지 검증(Assertion)")
    @Test
    public void generateTest1() {

        int actual = result.length();
        int expected = numberOfUpperCaseLetters+numberOfLowerCaseLetters+numberOfNumeric+numberOfSpecialChars;
        assertEquals(actual,expected);

    }
    @DisplayName("실습 3-2: 생성된 패스워드의 ‘알파벳 대문자’ 개수가 입력한 파라미터(numberOfUpperCaseLetters ) 숫자와 일치하는지 검증하세요")
    @Test
    public void generateTest2() {
    char[] Array = result.toCharArray();
    int actual = 0;
    for(char c : Array){
        if(Character.isUpperCase(c)) actual++;
    }
    int expected = numberOfUpperCaseLetters;
        assertEquals(actual,expected);
    }
    @DisplayName("실습 3-3: 생성된 패스워드의 ‘알파벳 소문자’ 개수가 입력한 파라미터(numberOfLowerCaseLetters) 숫자와 일치하는지 검증하세요.")
    @Test
    public void generateTest3() {
        char[] Array = result.toCharArray();
        int actual = 0;
        for(char c : Array){
            if(Character.isLowerCase(c)) actual++;
        }
        int expected = numberOfLowerCaseLetters;
        assertEquals(actual,expected);
    }
    @DisplayName("실습 3-4: 생성된 패스워드의 ‘0 이상인 숫자’의 개수가 입력한 파라미터(numberOfNumeric) 숫자와 일치하는지 검증하세요.")
    @Test
    public void generateTest4() {
        char[] Array = result.toCharArray();
        int actual = 0;
        for(char c : Array){
            if(Character.isDigit(c)) actual++;
        }
        int expected = numberOfNumeric;
        assertEquals(actual,expected);
    }
    @DisplayName("실습 3-5: 생성된 임시 패스워드의 ‘특수문자’ 개수가 입력한 파라미터(numberOfSpecialChars) 숫자와 일치하는지 검증하세요.")
    @Test
    public void generateTest5() {
        char[] Array = result.toCharArray();
        int actual = 0;
        for(char c : Array){
            int result = (int)c;
            if(result>32 && result<48) actual++;
        }
        int expected = numberOfSpecialChars;
        assertEquals(actual,expected);
    }
}
