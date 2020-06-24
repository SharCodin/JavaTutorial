
public class array_here {

	public static void main(String[] args) {
		// Array
		String[] names = new String[5];
		names[0] = "Toy";
		names[1] = "Jim";
		names[2] = "Tom";
		names[3] = "Bom";
		names[4] = "Don";
		System.out.println(names[0]);
		// Second way to use array
		int[] phoneNumbers = {12, 15, 14, 23, 14};
		System.out.println(phoneNumbers[0]);
		
		for(int i= 0; i < phoneNumbers.length; i++)
		{
			System.out.println(phoneNumbers[i]);
		}
	}
}
