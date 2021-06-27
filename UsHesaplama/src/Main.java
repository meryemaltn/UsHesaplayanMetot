import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Taban : ");
		int a= inp.nextInt();
		System.out.print("Üs : ");
		int b= inp.nextInt();
		
		System.out.print("Sonuç: "+ usHesaplama(a,b));
	}
	public static int usHesaplama(int a, int b) {
		if (a==1 || b==0) {
		  return 1;
		}
		  return a * usHesaplama (a, b - 1);
		}
	}
