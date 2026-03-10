package org.example;

public class kadai5 {

  public static void main(String[] args) {

    String firstName = "将" ;
    String familyName = "東薗";

    if(firstName.length() >= 2 && familyName.length() >= 2){
      System.out.println(familyName + " " + firstName);
    }else{
      System.out.println("条件に一致しませんでした。");
    }
  }
}