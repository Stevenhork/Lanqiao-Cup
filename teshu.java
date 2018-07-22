package 蓝桥杯;

import java.util.Scanner;

public class teshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new teshu().run();

	}
	public void run(){
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		for(int i=10000;i<100000;i++){
			int a1=i%10;
			int b1=i/10%10;
			int c1=i/100%10;
			int d1=i/1000%10;
			int e1=i/10000%10;
			if(a1==e1&&b1==d1&&n==a1+b1+c1+d1+e1){
				System.out.println(i);
			}
		}
		for(int i=100000;i<1000000;i++){
			int a2=i%10;
			int b2=i/10%10;
			int c2=i/100%10;
			int d2=i/1000%10;
			int e2=i/10000%10;
			int f2=i/100000%10;
			if(a2==f2&&b2==e2&&c2==d2&&n==a2+b2+c2+d2+e2+f2){
				System.out.println(i);
			}
		}
	}

}
