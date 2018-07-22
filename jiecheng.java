package 蓝桥杯;

import java.math.BigInteger;

public class jiecheng {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int n = 9999;
		BigInteger count = new BigInteger("1");
		long m=0;
		for (int i = 1; i <= n; i++) {
			BigInteger mid = new BigInteger("" + i);
			count = count.multiply(mid);
		}
		
		BigInteger a=new BigInteger("2");
		BigInteger b=new BigInteger("1");
		while(count.compareTo(new BigInteger("0"))>0){
			m++;
			count=count.divide(a);
		}
		
		System.out.println(m);

	}

}
