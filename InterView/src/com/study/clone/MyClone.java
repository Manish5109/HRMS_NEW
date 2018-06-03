package com.study.clone;

public class MyClone implements Cloneable {
	int roll;
	String name;
	public MyClone(int rol, String nm){
		roll=rol;
		name=nm;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String args[]){
		try{
			MyClone mcl = new MyClone(2, "test");
			MyClone mcl1 =(MyClone) mcl.clone();
			System.out.println(mcl.name+""+mcl.roll);
			System.out.println(mcl1.name+""+mcl1.roll);
		}catch(Exception e){
			System.out.println("exception caught");
		}

	}

}
