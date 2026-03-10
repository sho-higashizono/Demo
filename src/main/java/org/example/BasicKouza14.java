package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BasicKouza14 {

  public static void main(String[] args) {

    Map<String, String> addressMap = new HashMap<>();
    addressMap.put("井上", "hoge@gmail.com");
    addressMap.put("佐藤", "huga@gmail.com");
    addressMap.put("田中", "aabb@yahoo.co.jp");
    addressMap.put("東", "raise-tech");

    List<String> addressList = new ArrayList<>();
    for (Entry<String, String> address : addressMap.entrySet()) {
      if (address.getValue().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
        addressList.add(address.getValue());
      }
    }
    System.out.println(addressList);
  }
}