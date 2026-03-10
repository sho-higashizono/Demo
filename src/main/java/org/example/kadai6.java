package org.example;

import java.util.List;
import java.util.Map;

public class kadai6 {

  public static void main(String[] args) {

    //課題1//
    List<String> studentNamaList = List.of(
        "産屋敷", "冨岡", "胡蝶", "煉獄", "不死川", "伊黒", "甘露寺", "宇随", "時透", "悲鳴島"
    );
    for (String nameList : studentNamaList) {
      if (nameList.length() >= 3) {
        //System.out.println(nameList);
      }
    }
    //課題２//
    Map<Integer, String> studentNameMap = Map.of(
        1, "産屋敷", 2, "冨岡", 3, "胡蝶", 4, "煉獄", 5, "不死川",
        6, "伊黒", 7, "甘露寺", 8, "宇随", 9, "時透", 10, "悲鳴島"
    );
    for (Integer number : studentNameMap.keySet()) {
      if (number % 2 == 1) {
        System.out.println(studentNameMap.get(number));
      }
      ;
    }
    ;
  }
}