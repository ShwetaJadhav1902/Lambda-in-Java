package com.lambda;

public class MainDivision {
    public static void main(String[] args) {
		Divisiable d=(int a,int b)->{
			return a/b;
		};
		double div=d.div(9,7);
		System.out.println("Division:"+div);
	}

}
