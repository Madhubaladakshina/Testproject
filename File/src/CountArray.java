
public class CountArray {
	public static void main(String []args){
		 int array[]={5,9,7,4,8,6,1,33,11,13};
		          int count=0,eve_count=0;

				for (int i = 0; i <10; i++)  
				{
					if (array[i]%2==0) 
					{
					eve_count++;
					}
					else
					{
					    count++;
					}
				}
				System.out.println("The count of the even number is  " + eve_count);
				System.out.println("The count of the odd number is  " + count);
		              }


}
