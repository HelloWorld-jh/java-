package Ex_01;

public class Ex_5 {
	
	public static void main(String[] args) {
		//1+3+5... ������������ �󸶱��� ���ϸ� �� ����
		//1000�� �ʰ��ϴ��� �˾ƺ��� �������� �ۼ��Ͻÿ�
		//��������
		int n=1; // ���� ����
		int sum=0;
		final int MAX = 1000;
		
		while ( sum <=MAX) //���� 1000���� �۰ų� �������� �ݺ���
		{
			sum = sum+n ; // ���� ����
			n = n+2; // ���� ���Ѵ�
	
		}
		
		//������ ���ϱ�
		int last_n = n-2; // n���� �ϳ� ���� �ϰ� �ݺ��� �������� 
		//�������� ���ϱ� ���� -2�� �Ͽ���
		
		//��� ���
        System.out.println( "������ �� " + last_n );
        System.out.println( "�����ʰ��� " + sum);
        
		}
}
	