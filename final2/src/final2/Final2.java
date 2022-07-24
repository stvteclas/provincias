package final2;
import java.util.Scanner;

public class Final2 {
 private Scanner teclado;
 private String[] provincia;
 private int[] temp;
 private int[] mayor;
 private int valor=0;
 private double promedio;
 private int suma1,suma2,suma3;
 
 public void cargar()
 {
	 teclado=new Scanner (System.in);
	 provincia=new String[5];
	 temp= new int[5];
	 
	 
	 for (int f=0;f<provincia.length;f++)
	 {

		 System.out.print("ingrese provincia");
		 provincia[f]=teclado.next();
		 System.out.println("ingrese temperatura promedio diaria");
		 temp[f]= teclado.nextInt();
	 }
 }
 public void promedio()
 {
    int val=0;
	 for (int f=0;f<provincia.length;f++)
	 {
		  val=val + temp[f];
	 }
	 promedio= val/5;
	 System.out.println("La temperatura promedio de la region es :" +promedio);
 }
public void mayor()
{
	
	for (int f=0;f<provincia.length;f++)
	 {
			if(temp[f]>=suma2)
			{
				suma2=temp[f];
				suma1=suma2;
			}
	 }
	for (int f=0;f<provincia.length;f++)
	{
		if (temp[f]==suma2)
		{
			System.out.println("La provincia con mayor temperatura es:" +provincia[f]);
		}

	}
}
public void menor()
{
	for (int f=0;f<provincia.length;f++)
	{
		if (temp[f]<suma1)
		{
			suma3=temp[f];
		}
	}
	for (int f=0;f<provincia.length;f++)
		{
			if (temp[f]==suma3)
			{
				System.out.println("La provincia con menor temperatura es:" +provincia[f]);
			}	
		}
}
 public static void main(String[] ar)
	{
		Final2 pv; 
		pv=new Final2();
		pv.cargar();
		pv.promedio();
		pv.mayor();
		pv.menor();
		
	}
	
	 
 }
