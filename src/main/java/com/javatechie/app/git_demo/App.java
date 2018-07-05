package com.javatechie.app.git_demo;

public class App {
	public void addData(String data) {
		if(data!=null){
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}else{
			System.out.println("not valid user");
		}
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
