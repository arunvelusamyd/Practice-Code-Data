package com.revise.handon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

    public static void main(String args[]) {
        Map<String, String> map1 = Map.of("SG", "Singapore", "MY", "Malaysia", "ID", "Indonesia");
        System.out.println("map1: " + map1);

        Map<String, String> hashMap =  new HashMap<>();
        hashMap.put("3","rabbit");
        hashMap.put("1","cat");;
        hashMap.put("2","dog");
        hashMap.put(null,"No animals");
        hashMap.put("4",null);
        hashMap.put("5","cow");
        hashMap.put("6","fish");
        hashMap.put("7",null);
        hashMap.put(null,"no animals in null key");
        System.out.println("hashMap: " + hashMap);

        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1","cat");;
        linkedHashMap.put("3","rabbit");
        linkedHashMap.put("2","dog");
        System.out.println("linkedHashMap: "+linkedHashMap);

        Map<String,String> treeMap = new TreeMap<>();
        treeMap.put("1","cat");;
        treeMap.put("3","rabbit");
        treeMap.put("2","dog");
        //treeMap.put(null,"No animals");
        treeMap.put("4",null);
        treeMap.put("5","cow");
        treeMap.put("6","fish");
        treeMap.put("7",null);
        //treeMap.put(null,"no animals in null key");
        System.out.println("treeMap: "+treeMap);

    }
}
