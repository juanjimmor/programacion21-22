public class Prueba {
	public static void main (String[] args){
		// esto es un comentario de una sola linea
		/*
			esto es un comentario
			que cupa varias lineas
		*/
		
    int nota1, nota2, nota3;
    String entrada;
    
    System.out.println("Hola");
    System.out.print("Introduzca un valor entero: ");
    entrada = System.console().readLine();
    /*
    System.out.print("La cadena introducida es: ");
    System.out.println(entrada);
    */
    System.out.println("La cadena introducida es: "+entrada);
    nota1 = Integer.parseInt(entrada);
    /*
    System.out.print("El numero introducido es: ");
    System.out.println(nota1);
    */
    System.out.println("El numero introducido es: "+nota1);
	}
}



