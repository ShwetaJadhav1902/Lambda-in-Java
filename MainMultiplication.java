package com.lambda;

public class MainMultiplication {
    public static void main(String[] args) {
		Multiplicable m=(int a,int b)->{
			return a*b;
		};
		double multi=m.multi(9,7);
		System.out.println("Multiplication:"+multi);
	}

}
