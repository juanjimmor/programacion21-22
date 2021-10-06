public class Prueba3 {
	public static void main (String[] args){
		// esto es un comentario de una sola linea
		/*
			esto es un comentario
			que cupa varias lineas
		*/
		
    int nota1, nota2, nota3;
    float notaDecimal = 6.7256f;
   
    
    System.out.println("Hola. ¿Funcionará la tilde?");
    System.out.print("Introduzca un valor entero: ");
   
    
    nota1 = Integer.parseInt(System.console().readLine());
    /*
    System.out.print("El numero introducido es: ");
    System.out.println(nota1);
    */
    System.out.println("El numero introducido es: "+nota1);
    System.out.printf("El numero %-10d es el que has introducido.\n",nota1);
    System.out.printf("Ejemplo de nota %10.20f con decimales.\n");
	}
}



