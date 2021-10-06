public class Prueba4 {
	public static void main (String[] args){
    int a;
    int b;
    float resultado;
    
    System.out.println("Demostración de que JAVA no sabe dividir \"bien\"");
    System.out.print("Introduca dividendo: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Intrdouzca divisor: ");
    b = Integer.parseInt(System.console().readLine());
    /*
    resultado = a/(float)b;
    System.out.println("El resultado de la división es: "+resultado);
    */ 
    System.out.println("El resultado de la división es: "+a/(float)b);
	}
}



