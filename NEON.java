// Java Program to Check If a Number is Neon number or not
// Input  : 9
// Output : Given number  9 is Neon number

// Explanation : square of 9=9*9=81;
//               sum of digit of square : 8+1=9(which is equal to given number)
class NEON {

	public static boolean checkNeon(int n)
	{
		int square = n * n;
		int sum = 0;
		while (square > 0) {

			int r = square % 10;

			sum += r;

			square = square / 10;
		}

		if (sum == n)

			return true;
		else

			return false;
	}

	public static void main(String[] args)
	{
		int n = 9;

		if (checkNeon(n))

			System.out.println("Given number " + n
							+ " is Neon number");
		else

			System.out.println("Given number " + n
							+ " is not a Neon number");
	}
}
