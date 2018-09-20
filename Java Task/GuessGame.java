import java.util.Random;//导入java包
import java.util.Scanner;

public  class GuessGame//猜数字游戏
{
	int figure;	//数字为0到9的一个
	static int No=1;
	GuessGame()//初始化
	{
		figure=0;
		System.out.println("Everyone has three chances!");
		System.out.println("player  "+No+"  playing:");
		No++;	
	}
	void GameStart()//开始游戏
	{
		figure=new Random().nextInt(10);
		Scanner s=new Scanner(System.in);
		int i=0;
		while(i<3)//每个人只有三次机会
		{
			int guess=s.nextInt();
			if(figure==guess)//正确回答即可胜利
				{
					System.out.println("You Win!");
					break;
				}
			else
				System.out.println("Error!");
			++i;
		}
		if(i>=3)//表示失去了所有的机会，游戏失败！
			System.out.println("You Lose!");
			
	}
public static   void main(String[] args)//设置三个玩家来参与游戏
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