package À¶ÇÅ±­;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		new Fibonacci().run();

	}
	public void run(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]index=new int[n]; 
		if(1 <=n && n<=1000000){
			if(n<3){
				System.out.println(1);
			}
			if(n>=3){
				index[0]=1;
				index[1]=1;
				for(int i=2;i<n;i++){
					index[i]=index[i-1]+index[i-2];
			}
				System.out.println(index[n-1]%10007);
			
			}
		}
		
	}

}
