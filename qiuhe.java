package 蓝桥杯;

import java.util.Scanner;

public class qiuhe {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new qiuhe().run();

	}
	public void run(){
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long result=(n+1)*n/2;
		System.out.println(result);
	}

}
