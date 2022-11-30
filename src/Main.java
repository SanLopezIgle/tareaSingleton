public class Main {
    public static void main(String[] args) {
        Circulo circulo = Circulo.getInstance();
        circulo.setRadio(2.3f);

        Circulo circulo2 = Circulo.getInstance();
        circulo2.setRadio(23.67f);

        Circulo circulo3 = Circulo.getInstance();
        circulo3.setRadio(0.34f);
    }
}