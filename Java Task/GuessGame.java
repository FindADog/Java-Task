import java.util.Random;//����java��
import java.util.Scanner;

public  class GuessGame//��������Ϸ
{
	int figure;	//����Ϊ0��9��һ��
	static int No=1;
	GuessGame()//��ʼ��
	{
		figure=0;
		System.out.println("Everyone has three chances!");
		System.out.println("player  "+No+"  playing:");
		No++;	
	}
	void GameStart()//��ʼ��Ϸ
	{
		figure=new Random().nextInt(10);
		Scanner s=new Scanner(System.in);
		int i=0;
		while(i<3)//ÿ����ֻ�����λ���
		{
			int guess=s.nextInt();
			if(figure==guess)//��ȷ�ش𼴿�ʤ��
				{
					System.out.println("You Win!");
					break;
				}
			else
				System.out.println("Error!");
			++i;
		}
		if(i>=3)//��ʾʧȥ�����еĻ��ᣬ��Ϸʧ�ܣ�
			System.out.println("You Lose!");
			
	}
public static   void main(String[] args)//�������������������Ϸ
{
	GuessGame palyer1=new GuessGame();
	 palyer1.GameStart();
	System.out.println("____________________________________");
	GuessGame palyer2=new GuessGame();
	palyer2.GameStart();
	System.out.println("____________________________________");
	GuessGame palyer3=new GuessGame();
	palyer3.GameStart();	
}
}