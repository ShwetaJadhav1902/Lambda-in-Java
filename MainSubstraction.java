package com.lambda;

public class MainSubstraction {
public static void main(String[] args) {
		
		Substractable s=(int n,int m)->{
			return n-m;
		};
		
		double sub=s.sub(987,766);
		System.out.println("Sustraction:"+sub);
		
	}

}
