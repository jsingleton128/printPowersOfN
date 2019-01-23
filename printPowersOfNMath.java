package powersOfN;

public class printPowersOfNMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);
	}
	public static void printPowersOfN(int base, int exp) {
		for (int i = 0; i <= exp; i++) {
			System.out.print((int) Math.pow(base, i)+ " ");
		}
		System.out.println();		
	}
}
