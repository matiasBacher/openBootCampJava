public class App4 {
    public static void main(String[] args) {
        int numeroIf = 0;
        if(numeroIf>0){
            System.out.println("es positivo");
        }
        else if( numeroIf<0){
            System.out.println("es negativo");
        }
        else {
            System.out.println("es cero");
        }
        
        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println("el numero while tiene como valor"+numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println("el numero while tiene como valor"+numeroWhile);
            numeroWhile++;
        }while(numeroWhile<3);

        for (int numeroFor = 0; numeroFor<3;numeroFor++){
            System.out.println("el numeroFor tiene como valor"+numeroFor);
        }

        String estacion = "Otoño";

        switch (estacion){
            case "Otoño":
                System.out.println("caen las ojas");
                break;
            case "Primavera":
                System.out.println("Salen las flores");
                break;
            case "Verano":
                System.out.println("hace calor");
                break;
            case "Invierno":
                System.out.println("hace frio");
                break;
            default:
                System.out.println("no es una estacion");
                break;
        }
    }
    
}
