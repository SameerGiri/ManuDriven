import java.util.Scanner;
class User1
{
	public static int Add(int a,int b){
		return a+b;
	}
	public static int Sub(int a,int b){
		return a-b;
	}
	public static int Mul(int a,int b){
		return a*b;
	}
	public static int Div(int a,int b){
		return a/b;
	}

}

class ManuDriven extends User1
{

public static void main(String[] args) 
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a =inp.nextInt();
		System.out.println("Enter the value of b:");
		int b=inp.nextInt();
		System.out.println("Enter your choice:");
		System.out.println("01 Addition");
		System.out.println("02 Substraction");
		System.out.println("03 Multiplication");
		System.out.println("04 Division");
		int choice =inp.nextInt();
		switch(choice){
			case 1:System.out.println("add method:"+(Add(a,b)));
			break;
			case 2:System.out.println("sub method:"+(Sub(a,b)));
			break;
			case 3: System.out.println("mul method:"+(Mul(a,b)));
			break;
			case 4:System.out.println("Div method:"+(Div(a,b)));
	}

	}
}
