

public class Car//汽车类
{
	String name;
	double tank;
	double OilConsumption;
	static boolean Oil=false;//判断车是否加了油
	Car()//构造函数给对象初始化
	{
		name="五菱宏光";
		tank=2000.2;
		OilConsumption=300.9;
	}
	public void AddGas()//给车加油
	{
		System.out.println("正在加油!");
		System.out.println("________________");
		System.out.println("已加满!");
		Oil=true;
	}
	public void CanRun()//车是否有油，能跑
	{
		if(Oil==false)
			System.out.println("车不能跑啦!");
		else
			System.out.println("车能跑!");
	}


	public static void main(String[] args)
	{
		Car car1=new Car();
		car1.CanRun();
		car1.AddGas();
		car1.CanRun();
	}
}