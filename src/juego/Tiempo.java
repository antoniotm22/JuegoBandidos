package juego;

import java.io.IOException;
import java.util.Date;

public class Tiempo {

	
	
	/**
	 * 
	 */
	public static void tiempoInicio() {
		
		long tiempoInicio = new Date().getTime();
		
		long tiempoFin =  new Date().getTime();
		
		System.out.println();
	}
	
	/**
	 * 
	 * @return
	 */
	public static int[] generaArray() {
		
		int array[] = new int[3];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int)Math.round(Math.random()*1);
		}
		
		return array;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void muestraArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean comparaArray(int[]array1, int array2[]) {
		
		boolean esIgualArray = false;
		
		for (int i = 0; i < array1.length; i++) {
			
			if(array1[i] == array2[i]) {
				esIgualArray = true;
			}
		}
		
		
		return esIgualArray;
		
	}
	
	/**
	 * @throws InterruptedException 
	 * 
	 */
	public static void clrscr() throws InterruptedException{

	    //Clears Screen in java

	    try {

	        if (System.getProperty("os.name").contains("Linux"))

	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	        else

	            Runtime.getRuntime().exec("clear");

	    } catch (IOException ex) {}

	}
	
	
	
	/**
	 * 
	 */
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
}
