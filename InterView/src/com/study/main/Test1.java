package com.study.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {
	public static void main(String args[]){
		int num =1001;
		System.out.println(num % 100);
		
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 70);
        map.put(3, 30);
        map.put(4, 90);
        map.put(5, 60);
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        Entry<Integer, Integer> maxEntry = null;
        System.out.println(map.containsValue(maxValueInMap));
        for(Map.Entry<Integer, Integer> ent : map.entrySet()){
        	int a = ent.getValue();
        	if(a==maxValueInMap){
        		maxEntry = ent;
        	}
        }
        System.out.println(maxEntry);
//        for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
//            if (entry.getValue()==maxValueInMap) {
//                System.out.println(entry.getKey());     // Print the key with max value
//            }
       // }
        
        System.out.println(maxValueInMap);

	}

}
