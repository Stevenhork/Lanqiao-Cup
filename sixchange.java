package 蓝桥杯;

import java.util.Scanner;

public class sixchange {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new sixchange().run();

	}

	public void run() {
		Scanner in = new Scanner(System.in);
		String n1=in.nextLine();
		int n=Integer.parseInt(n1);
		String a[] = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLine();
		}
		String b[] = new String[n];
		for(int i=0;i<n;i++){
			b[i]="";
		}
		for (int i = 0; i < n; i++) {
			String zhong = a[i];
			for (int j = 0; j < a[i].length(); j++) {
				switch (zhong.charAt(j)) {
				case '0':
					b[i] += "0000";
					break;
				case '1':
					b[i] += "0001";
					break;
				case '2':
					b[i] += "0010";
					break;
				case '3':
					b[i] += "0011";
					break;
				case '4':
					b[i] += "0100";
					break;
				case '5':
					b[i] += "0101";
					break;
				case '6':
					b[i] += "0110";
					break;
				case '7':
					b[i] += "0111";
					break;
				case '8':
					b[i] += "1000";
					break;
				case '9':
					b[i] += "1001";
					break;
				case 'A':
					b[i] += "1010";
					break;
				case 'B':
					b[i] += "1011";
					break;
				case 'C':
					b[i] += "1100";
					break;
				case 'D':
					b[i] += "1101";
					break;
				case 'E':
					b[i] += "1110";
					break;
				case 'F':
					b[i] += "1111";
					break;
				default:
					break;
				}
			}
			

		}
		String c[]=new String[n];
		for(int i=0;i<n;i++){
			c[i]="";
		}
		
		for(int i=0;i<b.length;i++){
			
			if((b[i].length())%3==1){
				b[i]="00"+b[i];
			}
			if((b[i].length())%3==2){
				b[i]='0'+b[i];
			}
			
			for(int j=0;j<b[i].length()-2;j+=3){
				int k1=Integer.parseInt(String.valueOf(b[i].charAt(j)));
				int k2=Integer.parseInt(String.valueOf(b[i].charAt(j+1)));
				int k3=Integer.parseInt(String.valueOf(b[i].charAt(j+2)));
				int p=4*k1+2*k2+1*k3;
				c[i]+=String.valueOf(p);
				}
				
			}
		int d[]=new int[n];
		
		for(int i=0;i<n;i++){
			d[i]=Integer.parseInt(c[i]);
			System.out.println(d[i]);
			
		}
		}

	

}
