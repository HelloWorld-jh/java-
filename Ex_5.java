package Ex_01;

public class Ex_5 {
	
	public static void main(String[] args) {
		//1+3+5... 등차수열에서 얼마까지 합하면 그 값이
		//1000을 초과하는지 알아보는 순서도를 작성하시오
		//변수선언
		int n=1; // 항을 누적
		int sum=0;
		final int MAX = 1000;
		
		while ( sum <=MAX) //합이 1000보다 작거나 같을동안 반복함
		{
			sum = sum+n ; // 항을 누적
			n = n+2; // 항을 구한다
	
		}
		
		//이전항 구하기
		int last_n = n-2; // n항이 하나 증가 하고 반복을 나옴으로 
		//이전항을 구하기 위해 -2를 하였음
		
		//결과 출력
        System.out.println( "마지막 항 " + last_n );
        System.out.println( "누적초과값 " + sum);
        
		}
}
	