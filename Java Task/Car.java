

public class Car//������
{
	String name;
	double tank;
	double OilConsumption;
	static boolean Oil=false;//�жϳ��Ƿ������
	Car()//���캯���������ʼ��
	{
		name="������";
		tank=2000.2;
		OilConsumption=300.9;
	}
	public void AddGas()//��������
	{
		System.out.println("���ڼ���!");
		System.out.println("________________");
		System.out.println("�Ѽ���!");
		Oil=true;
	}
	public void CanRun()//���Ƿ����ͣ�����
	{
		if(Oil==false)
			System.out.println("����������!");
		else
			System.out.println("������!");
	}


	public static void main(String[] args)
	{
		Car car1=new Car();
		car1.CanRun();
		car1.AddGas();
		car1.CanRun();
	}
}