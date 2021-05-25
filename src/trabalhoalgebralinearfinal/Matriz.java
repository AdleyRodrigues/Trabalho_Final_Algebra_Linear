package trabalhoalgebralinearfinal;

public class Matriz {

    private int linhas;
    private int colunas;
    private double[][] matriz;

    public Matriz(int i, int j) {

        matriz = new double[i][j];

        this.linhas = i;
        this.colunas = j;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public void setValor(int i, int j, double valor) {

        matriz[i][j] = valor;
    }

    public double getValor(int i, int j) {

        return matriz[i][j];
    }
    

}
