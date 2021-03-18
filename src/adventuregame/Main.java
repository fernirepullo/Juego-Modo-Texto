package adventuregame;

public class Main {

    public static void main(String[] args) {

        // PRUEBA DE CLASES
        Operaciones op = new Operaciones();

        for (int i = 0; i < 20; i++) {

            int testVida = op.getVidaAleatoria(20 , 50);
            System.out.println(testVida);
        }
    }
}
