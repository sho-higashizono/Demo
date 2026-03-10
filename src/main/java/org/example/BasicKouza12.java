package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class BasicKouza12 {

  public static void main(String[] args) {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaコース楽しすぎる", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生した");
    }
  }
}