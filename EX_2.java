package Ex_01;

import java.util.Scanner;

public class EX_2 {
	

	public static void main(String[] args) {

		// 1+(1+2)+(1+2+3)+(1+2+3+4)...
		//(1+2+3....100)������ ��

		//���� ����
		int n=1; // �Է�
		int sum=0; //�ݺ������
		final int MAX = 100;
	
		 Scanner sc = new Scanner(System.in);
		 

		 //ó��
		while(n <= MAX) {
			sum = sum + n ; //�� ����
			n= n+1; //���� ���Ѵ�
			
		}
		

		//���

		System.out.println( " ��� ���� ��:"  +  n+sum  );
	 
}
}
