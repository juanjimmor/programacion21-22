public class PiramideAncho {
  public static void main (String[] args) {
    int altura;
    int anchura;
  
    System.out.println("Este programa dibuja un triángulo dentro de otro.");
    do {
      System.out.print("Indica altura (>=3): ");
      altura = Integer.parseInt(System.console().readLine());
      if (altura < 3) {
        System.out.print("Incorrecto. ");
      }
    } while (altura < 3);
    
    do {
      System.out.print("Indica anchura (>=1): ");
      anchura = Integer.parseInt(System.console().readLine());
      if (anchura < 1) {
        System.out.print("Incorrecto. ");
      }
    } while (anchura < 1);
    
    System.out.println();
    
    for (int i=0; i<altura; i++) {
      // espacios en blanco previos
      for (int j=0; j<altura-1-i; j++){
        System.out.print(" ");
      }
      // caracteres 1
      for (int j=0; (j<anchura) && j<(2*i+1); j++) {
        System.out.print("*");
      }
      // espacios en blanco de enmedio
      if (i < (altura-anchura)) {
        //for (int j=0; j<(2*i-1); j++) {
        for (int j=0; j<(2*i+1-2*anchura); j++) {
          System.out.print(" ");
        }
      } else {
        for (int j=0; j<(2*i+1-2*anchura); j++) {
          System.out.print("*");
        }
      }
      // caracter 2
      /*
      int anchura2;
      if (anchura < (2*i+1-anchura)) {
        anchura2 = anchura;
      } else {
        anchura2 = 2*i+1-anchura;
      }
      */
      int anchura2 = anchura < (2*i+1-anchura) ? anchura : 2*i+1-anchura;
      
      for (int j=0; j<anchura2; j++) {
        System.out.print("*");
      }
    
      System.out.println();
    }
    
  }
}
