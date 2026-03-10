package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class kadai7 {

  public static void main(String[] args) {

//    //下記サンプルお試しコード
//    //ショートカット複数行コメントアウト又は解除→Ctrl + /
//    List<String> memberList = List.of(
//        "産屋敷", "冨岡", "胡蝶", "煉獄", "不死川", "伊黒", "甘露寺", "宇随", "時透", "悲鳴島"
//    );
//    memberList.stream()
//        .filter(m -> m.length() >= 2)
//        .forEach(System.out::println);

    //  課題１
    List<String> memberList = List.of(
        "産屋敷", "冨", "胡蝶", "煉", "不死川", "伊", "甘露寺", "宇", "時透", "悲"
    );
    System.out.println(memberList.stream()
        .filter(member -> member.length() >= 2)
        .collect(Collectors.joining(","))
    );

    //課題２
    List<Integer> numberList = List.of(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    );
    System.out.println(numberList.stream()
        .filter(number -> number % 2 == 1)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0)
    );

    //課題３
    //Chat GPTの課題
    //整数のリストが10個与えられています。
    //偶数だけを取り出して、それらの 2 乗の合計を求めるプログラムを書きなさい。
    List<Integer> numberList2 = List.of(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    );
    numberList2.stream()
        .filter(number2 -> number2 % 2 == 0)
        .map(number2 -> number2 * number2)
        .forEach(System.out::println);
  }
}