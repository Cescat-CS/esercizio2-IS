public class Calcolatrice {

    private int a, b;

    public Calcolatrice() {
        this.a = 0;
        this.b = 0;
    }

    public int somma(int a, int b){
        return a+b;
    }

    public int sottrazione(int a, int b){
        return a-b;
    }

    public double divisione(int a, int b){
        return (b != 0) ? a/b : 0;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }


}
