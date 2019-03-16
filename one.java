import java.util.Scanner;
class OddEven{
	public static void main (String[] arg){
		Scanner Scan=new Scanner(System.in);
		int a= Scan.nextInt();
		if(a%2==0){
			System.out.println("Even");
		}
	        else if(a%2!=0 & a>0){
			System.out.println("Odd");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
