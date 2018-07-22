package 蓝桥杯;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new sort().run();

	}
	public void run(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int[]arr=new int[n];
		for(int k=0;k<n;k++){
			arr[k]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int sub=arr[i];
					arr[i]=arr[j];
					arr[j]=sub;
				}
				
			}
			
		}
		for(int k=0;k<n;k++){
			System.out.print(arr[k]+" ");
		}
	}

}
