package com.study.override;

public class ChildMain extends ParentMain {

	public String s = "abccccc111";

	public ChildMain() {
		super();
	}

	public static void main(String args[]) {
		System.out.println("child main called");
		// System.out.println(a);

		ChildMain cm = new ChildMain();
		System.out.println(cm.s);
		ParentMain pm = new ChildMain();
		System.out.println(pm.s);
	}
}
