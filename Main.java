package ���ű�;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Main().run();

	}
	public void run(){
		Scanner cin=new Scanner(System.in);
		BigInteger n=cin.nextBigInteger();
		BigInteger m=cin.nextBigInteger();
		
		
		
	}
	public BigInteger sqrt(int n){
		BigInteger mid=BigInteger.valueOf((long) Math.floor(Math.sqrt(n)));
		
		return mid;
	}

}
