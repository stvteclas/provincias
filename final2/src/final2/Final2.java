package final2;
import java.util.Scanner;

public class Final2 {
 private Scanner teclado;
 private String[] provincia;
 private int[] temp;
 private int mayor, menor;
 private double promedio;
 
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
		 menor= temp[f];
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
	int s=0,m=0;
	for (int f=0;f<provincia.length;f++)
	 {
			if(temp[f]>=mayor)
			{
				mayor=temp[f];
				s=f;
			}
			if (temp[f]<= menor)
			{
				menor=temp[f];
				m=f;

			}
	 }
	 System.out.println("La provincia con mayor temperatura es:" +provincia[s]);
	 System.out.println("La provincia con menor temperatura es:" +provincia[m]);
}

 public static void main(String[] ar)
	{
		Final2 pv; 
		pv=new Final2();
		pv.cargar();
		pv.promedio();
		pv.mayor();
		
	}
	
	 
 }
 