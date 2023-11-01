package hwch2_110360142;

import java.lang.reflect.Array;

public class Sample2_16 
{
	public static void main(String[] args)
	{
		int[] intArray = (int[]) Array.newInstance(int.class, 3);
		//資料類型[] 陣列變數名稱; = (資料類型[]) Array.newInstance(資料類型的類別,陣列長度)
		
		Array.set(intArray, 0, 123);
		Array.set(intArray, 1, 456);
		Array.set(intArray, 2, 789);
		
		System.out.println("intArray[0]=" + Array.get(intArray, 0));
		System.out.println("intArray[1]=" + Array.get(intArray, 1));
		System.out.println("intArray[2]=" + Array.get(intArray, 2));
	}

}

