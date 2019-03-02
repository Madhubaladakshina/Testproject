
public class FindBiggest {
    public static void main(String args[]) {
        int array[]={50,60,40,30,10,20,10,5,80,55};
		int max = array[0]; 
		for (int i = 1; i < array.length; i++)  
		{
		if (array[i] > max) 
			{
			max = array[i];
			}
		}
		System.out.println("The biggest number within the array is " + max);     }    


}
