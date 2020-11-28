package com.essai.Caluclateur;

public class Calculator {
	
	// addition
	public int sum(int a,int b)
	{
		return a+b;
	}

	// soustraction
	public int minus(int a, int b) {
		return a - b;
	}

	// division
	public int divide(int a, int b) {
		return a / b;
	}

	/**
	 *  : retourne le plus petit élément d’une liste
	 * @param list
	 * @return
	 */
	public int minElement(int[] list)
	{
		int min=list[list.length-1];
		for(int i=list.length-1;i>1;i--)
		{

			if(min>list[i-1])
			{
				min=list[i-1];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		System.out.println("merci Mountakha");
	}


	/**
	 *  : retourne le plus grand élément d’une liste
	 * @param list
	 * @return
	 */
	public int maxElement(int[] list) {
		int max = list[list.length - 1];
		for (int i = list.length - 1; i > 1; i--) {

			if (max < list[i - 1]) {
				max = list[i - 1];
			}
		}
		return max;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public int min(int a, int b)
	{
		return Math.min(a, b);
	}
	public int max(int a, int b)
	{
		return Math.max(a, b);
	}
}
