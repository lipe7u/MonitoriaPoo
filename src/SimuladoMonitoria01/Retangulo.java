package SimuladoMonitoria01;

public class Retangulo{
    private double largura;
    private double altura;

    public Retangulo(){
        largura = 1.0;
        altura = 1.0;
    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getAltura(){return altura;}

    public double getLargura(){return largura;}


    public double calcularArea(){
        return this.largura * this.altura;
    }

    public boolean isQuadrado(){
        return this.largura == this.altura;
    }

    public static void main(String[] args){
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(5.0);
        retangulo.setLargura(5.0);
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.isQuadrado());
    }

}
