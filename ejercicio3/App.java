public class App {
    public static void main(String[] args) {
        System.out.println(suma(1,2,3));
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas(1);
       System.out.println(miCoche.getPuertas()); 
    }

    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
    
}
