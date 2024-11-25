public class AddNums
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

		Addition an = (x, y) -> {
		int sum = 0;
			for(int i = x; i <= y; i++){
				sum += i;
			}
			return sum;

		};

		int result = an.add(a, b);
		System.out.print("The sum is "+result);

	}
}