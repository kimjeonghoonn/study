import java.util.*;
public class BackJoon2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c= 0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int x=a*b*c;
		String str=Integer.toString(x);
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0')==i) { //charAt()을 쓰는 경우 -'0' or -'48' 해야함 안그럼 아스키코드..
					count++;
				}
			}
			System.out.println(count);
		}
	}
}