import java.util.Scanner;
class OddEven{
	public static void main (String[] arg){
		Scanner Scan=new Scanner(System.in);
		int a= Scan.nextInt();
		if(a%2==0){
			System.out.println("even");
		}
	        else if(a%2!=0 & a>0){
			System.out.println("odd");
		}
		else{
			System.out.println("invalid");
		}
	}
}
