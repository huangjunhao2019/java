public class TestReverse{
	public static int[] reverse(int[] list){
		int[] result=new int[list.length];
		for(int i=0,j=result.length-1;i<result.length;i++,j--)
			result[i]=list[j];
		return result;
	}
        public static void main(String[] args){
		int[] list={1,2,3,4};
		int[] result=reverse(list);
		for(int element:result){
			System.out.print(element+" ");
		}
		System.out.print("\n");
	}
}
