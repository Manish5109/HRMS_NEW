package com.study.immutable;

public class ThreadSafeSingleton {
	private static final ThreadSafeSingleton ths = null;
	private ThreadSafeSingleton(){}
	
	public static ThreadSafeSingleton getInstance(){
		if(ths==null){
			synchronized(ThreadSafeSingleton.class){
				if(ths==null){
					return new ThreadSafeSingleton();
				}
			}
		}
		return ths;
	}

}
