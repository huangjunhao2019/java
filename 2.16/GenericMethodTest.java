public class GenericMethodTest{
	public static <E> void printArray(E[] inputArray){
		for(E element:inputArray){
			System.out.printf("%s ",element);
		}
		System.out.print("\n");
	}
	public static void main(String[] args){
		Integer[] intArray={1,2,3,4,5};
		Double[] doubleArray={1.1,2.2,3.3,4.4};
		Character[] charArray={'H','E','L','L','O'};

		System.out.println("The integer array is ");
		printArray(intArray);

		System.out.println("The double array is ");
		printArray(doubleArray);

		System.out.println("The character array is ");
		printArray(charArray);
	}
}
