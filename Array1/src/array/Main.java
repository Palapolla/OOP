package array;

public class Main {

    public static void main(String[] args) {
	    int[] price = new int[10];
	    for(int i=0;i<10;i++)
	    {
	    	price[i] = 5*(i+1);
		}
	    for(int i=0;i<10;i++)
		{
			System.out.println(price[i]);
		}
    }
}
