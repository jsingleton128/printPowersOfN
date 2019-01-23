package powersOfN;

public class printPowersOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
		
	}
	public static void printPowersOfN(int base, int exp) {
		int solution = (base * base);
		System.out.print("1 " + base + " " + solution + " ");
		for (int i = 1; i <= exp - 2; i++) {
			System.out.print(solution * base + " ");	
			solution = solution * base;
		}
		System.out.println();
	}
	
}
