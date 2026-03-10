package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class kadai8 {

  public static void main(String[] args) {
    //課題１
    try {
      Path path = Path.of("JavaBasic.txt");
      Files.writeString(path, "入出力処理を実装しましょう。", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      //課題2
      e.printStackTrace();
      System.out.println("Fileがありません");
    }
    //課題３
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "入出力処理を再度実装しましょう", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Fileが再度ありません。");
    }
  }
}