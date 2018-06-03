package com.study.immutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public final class MapImmutable {

	 
	public static void main(String args[]){
		
		final HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "one");
		Map<Integer, String> mp = Collections.unmodifiableMap(map);
		//mp.put(2, "two");
		
		System.out.println(mp);
	}
}
