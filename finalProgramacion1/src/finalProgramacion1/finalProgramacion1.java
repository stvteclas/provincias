package finalProgramacion1;
import java.util.Scanner;

public class finalProgramacion1 {
 private Scanner teclado;
 private String[] apellido;
 private int[] nota1;
 private int[] nota2;
 private int[] nota3;
 private int[] nota4;
 private int[] mayor;
 private int valor=0;
 private double promedio;
 private int suma1,suma2,suma3,suma4;
 
 public void cargar()
 {
	 teclado=new Scanner (System.in);
	 apellido=new String[5];
	 nota1= new int[5];
	 nota2= new int[5];
	 nota3= new int[5];
	 nota4= new int[5];
	 
	 
	 for (int f=0;f<apellido.length;f++)
	 {
		 int acum=1;
		 System.out.print("ingrese apellido");
		 apellido[f]=teclado.next();
		 System.out.println("ingrese la primera nota");
		 nota1[f]= teclado.nextInt();
		 System.out.println("ingrese la segunda nota");
		 nota2[f]= teclado.nextInt();
		 System.out.println("ingrese la tercera nota");
		 nota3[f]= teclado.nextInt();
		 System.out.println("ingrese la cuarta nota");
		 nota4[f]= teclado.nextInt();
	 }
 }
 public void promedio()
 {
	 valor=0;
	 for (int f=0;f<apellido.length;f++)
	 {
		 int valor=nota1[f]+nota2[f]+nota3[f]+nota4[f];
		 promedio= valor/4;
		 System.out.println(apellido[f] + " su promedio es:" +promedio);
	 }
 }
public void mayor()
{
	int cn1=0;
	int cn2=0;
	int cn3=0;
	int cn4=0;
	for (int f=0;f<apellido.length;f++)
	 {
		
			if(nota1[f]>=nota2[f])
			{
				if(nota1[f]<=nota3[f])
				{
					if(nota3[f]>=nota4[f])
					{
						System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota3[f]);
				    }
					else
					{
						System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota4[f]);
					}
				}
				else
				{
					if(nota1[f]<=nota4[f])
					{
						System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota4[f]);
					}
					else
					{
						System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota1[f]);
					}
				}
			   }
			else
				{
					if(nota2[f]>=nota3[f])
					{
						if(nota2[f]>=nota4[f])
						{
							System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota2[f]);
						}
						else
						{
							System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota4[f]);
						}
					}
					else
					{
						if(nota3[f]>=nota4[f])
						{
							System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota3[f]);
						}
						else
						{
							System.out.println("el alumno:" + apellido[f] + " obtuvo la calificacion mas alta de:" +nota4[f]);	
						}
				    }
					}
				}
		   }
		
 public static void main(String[] ar)
	{
		finalProgramacion1 pv; 
		pv=new finalProgramacion1();
		pv.cargar();
		pv.promedio();
		pv.mayor();
		
	}
	
	 
 }
