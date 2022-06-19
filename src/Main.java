import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estructura if: ");
        estructuraIf(2);
        System.out.println("\nBucle While:");
        bucleWhile(2);
        System.out.println("\nBucle Do While:");
        bucleDoWhile(2);
        System.out.println("\nBucle For:");
        bucleFor();
        System.out.println("\nEstructura Switch:");
        estructuraSwitch("OtOñO");
    }

    public static void estructuraIf(int numeroIf){
        if(numeroIf>0){
            System.out.println("El valor "+numeroIf+" es Positivo");
        }else if(numeroIf<0){
            System.out.println("El valor "+numeroIf+" es Negativo");
        }else{
            System.out.println("El valor es "+0);
        }
    }

    public static void bucleWhile(int numeroWhile){
        int i = 0;
        int numeroWhileAux = numeroWhile;
        if(numeroWhile<3){
          while (i<=numeroWhile){
              System.out.println("i="+ i + " numeroWhile="+ ++numeroWhileAux);
              i++;
          }
        }else{
            System.out.println("Ingrese un número menor a 3");
        }
    }

    public static void bucleDoWhile(int numeroDoWhile){
        int i = 0;
        int numeroDoWhileAux = numeroDoWhile;
        if(numeroDoWhile<3){
            do{
                System.out.println("i="+ i + " numeroDoWhile="+ ++numeroDoWhileAux);
                i++;
            }while (i>numeroDoWhile);
        }else{
            System.out.println("Ingrese un número menor a 3");
        }
    }

    public static void bucleFor(){
       for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
           System.out.println("numeroFor="+numeroFor);
       }
    }

    public static void estructuraSwitch(String estacion){
        estacion = estacion.toUpperCase();
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en Primavera");
                break;
            case "VERANO":
                System.out.println("Estamos en Verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en Otoño");
                break;
            case "INVIERNO":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("Este valor no es una estación");
                break;
        }
    }

}