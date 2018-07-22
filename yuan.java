import java.math.BigDecimal;
import java.util.Scanner;

public class yuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new yuan().run();

	}
	public void run(){
		Scanner in=new Scanner(System.in);
		BigDecimal r=in.nextBigDecimal();
		BigDecimal value= r.multiply(r.multiply(new BigDecimal(Math.PI))).setScale(7, BigDecimal.ROUND_HALF_UP);
		System.out.println(value);
	}

}
