public class Circulo {
    private float radio;

    private Circulo(){}

    private static Circulo cir1 = null;

    public static Circulo getInstance() {
        if (cir1 == null) {
            cir1 = new Circulo();
        }
        return cir1;
    }

    public float getRadio(){
        return radio;
    }

    public void setRadio(float radio){
        this.radio = radio;
    }
}
