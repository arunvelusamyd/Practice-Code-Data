package com.revise.handon;

import java.util.*;

public class CollectionsSample {

    public static void main(String args[]){

        List<String> immutableList = List.of("Tampines","Bedok", "Simei");
        Set<String> immutableSet = Set.of("Singapore","Malaysia","Indonesia");
        Map<String,String> immutableMap = Map.of("SG","Singapore","MY","Malaysia","ID","Indoesnia");

        System.out.println("immutableList: "+immutableList);
        /*try {
            immutableList.add("Pasir Ris");
        } catch (Exception e) {
            System.out.println(e.getMessage());;

        }*/

        System.out.println("immutableSet: "+immutableSet);
        /*try {
            immutableSet.add("Singapore");
        }catch (Exception e){
            e.printStackTrace();
        }*/

        System.out.println("immutableMap: "+immutableMap);
        /*try {
            immutableMap.put("HK","Hong Kong");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //ArrayList: Best for read-heavy applications with frequent random access or adding elements to the end.
        //LinkedList: Best for write-heavy applications requiring frequent insertions/deletions at the beginning or middle, or for building stacks/queues.
        List<String> list1 = new ArrayList<>();
        list1.add("Tampines");
        list1.add("Bedok");
        list1.add("Simei");
        System.out.println("list1: "+list1);
        list1.add("Tampines");
        System.out.println("list1: "+list1);
        System.out.println(list1.get(0));
        for(String str:list1){
            System.out.println("String for loop: "+str);
        }

        System.out.println();
        System.out.println();
        Set<String> set1 = new HashSet<>();
        set1.add("Singapore");
        set1.add("Malaysia");
        set1.add("Indonesia");
        System.out.println("set1: "+set1);
        set1.add("Singapore");
        System.out.println("set1: "+set1);
        System.out.println(set1.remove("Indonesia"));
        System.out.println("set1: "+set1);
        //set1.clear();
        //System.out.println("set1: "+set1);
        set1.iterator().forEachRemaining(System.out::println);
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.println("String Iterator: "+iterator.next());
        }


        System.out.println();
        System.out.println();
        Map<String,String> map1 = new HashMap<>();
        map1.put("SG","Singapore");
        map1.put("MY","Malaysia");
        map1.put("ID","Indonesia");
        System.out.println("map1: "+map1);
        map1.put("SG","Singapore");
        map1.put("HK","Hong Kong");
        System.out.println("map1: "+map1);
        map1.remove("ID");
        System.out.println("map1: "+map1);
        System.out.println(map1.get("SG"));
        System.out.println(map1.containsValue("Indonesia"));
        System.out.println(map1.containsKey("SG"));
        //map1.clear();
        System.out.println("map1: "+map1);

        System.out.println("#######THE END#######");
    }

}
