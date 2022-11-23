import java.util.Scanner;

public class BackJoon1546 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		int max=0;
		int sum =0;
		double avg;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
			sum+=arr[i];
		}
		avg=100.0*sum/max/n;
		System.out.println(avg);
	}
}
