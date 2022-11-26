public class BackJoon4673 {
    
    public static int selfNum(int x) {
		int sum=x;
		while(x!=0) {
			sum=sum+(x%10); //첫 째 자리수
			x = x/10; //10을 나누어 첫 째 자리를 없앤다
		}
		return sum;
	}
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		for (int i=0; i<10001;i++) {
			int n = selfNum(i);
			if(n<10001) {
				check[n]=true;
			}
		}
		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
}
