// Yathaarth Singh & Saim Meher
public class AddNums
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

		Addition an = (start, end) -> {
		int sum = 0;
			for(int i = start; i <= end; i++)
			{
				sum += i;
			}
			return sum;
		};

		int result = an.add(a, b);
		System.out.print("The sum is "+result);

	}
}
