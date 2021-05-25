package trabalhoalgebralinearfinal;

import java.util.Scanner;
import static trabalhoalgebralinearfinal.Operações.matrizAdjunta;
import static trabalhoalgebralinearfinal.Operações.matrizAdjunta;

public class Operações {

    public static Scanner scan = new Scanner(System.in);

    //utilizar virgula se for usar numero real
    public static void somarMatriz() {
        System.out.println("Numero de linhas da matriz A?");
        int linhas = scan.nextInt();

        System.out.println("Numero de Colunas da matriz A?");
        int colunas = scan.nextInt();

        System.out.println("Numero de linhas da matriz B?");
        int linhas2 = scan.nextInt();

        System.out.println("Numero de Colunas da matriz B?");
        int colunas2 = scan.nextInt();

        if (linhas != linhas2 || colunas != colunas2) {
            System.out.println("Numero de linhas ou de colunas está diferente nas matrizes!");
        } else {

            double matriz1[][] = new double[linhas][colunas];
            double matriz2[][] = new double[linhas2][colunas2];
            int i, j;

            for (i = 0; i < linhas; i++) {
                System.out.println();
                for (j = 0; j < colunas; j++) {
                    System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz A: ");
                    matriz1[i][j] = scan.nextDouble();
                }
            }

            for (i = 0; i < linhas2; i++) {
                System.out.println();
                for (j = 0; j < colunas2; j++) {
                    System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz B: ");
                    matriz2[i][j] = scan.nextDouble();
                }
            }

            System.out.println("Matriz A: ");
            //mostrando matriz 1
            for (i = 0; i < linhas; i++) {
                for (j = 0; j < colunas; j++) {
                    System.out.print(matriz1[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("Matriz B: ");
            //mostrando matriz 2
            for (i = 0; i < linhas2; i++) {
                for (j = 0; j < colunas2; j++) {
                    System.out.print(matriz2[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            double matrizResul[][] = new double[linhas][colunas];
            //Somando matrizes
            System.out.println("Matriz resultante: ");
            for (i = 0; i < linhas; i++) {
                for (j = 0; j < colunas; j++) {
                    matrizResul[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(matrizResul[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }

    //utilizar virgula se for usar numero real
    public static void subtrairMatriz() {
        System.out.println("Numero de linhas da matriz A?");
        int linhas = scan.nextInt();

        System.out.println("Numero de Colunas da matriz A?");
        int colunas = scan.nextInt();

        System.out.println("Numero de linhas da matriz B?");
        int linhas2 = scan.nextInt();

        System.out.println("Numero de Colunas da matriz B?");
        int colunas2 = scan.nextInt();

        if (linhas != linhas2 || colunas != colunas2) {
            System.out.println("Numero de linhas ou de colunas está diferente nas matrizes!");
        } else {

            double matriz1[][] = new double[linhas][colunas];
            double matriz2[][] = new double[linhas2][colunas2];
            int i, j;

            for (i = 0; i < linhas; i++) {
                System.out.println();
                for (j = 0; j < colunas; j++) {
                    System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz A: ");
                    matriz1[i][j] = scan.nextDouble();
                }
            }

            for (i = 0; i < linhas2; i++) {
                System.out.println();
                for (j = 0; j < colunas2; j++) {
                    System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz B: ");
                    matriz2[i][j] = scan.nextDouble();
                }
            }

            System.out.println("Matriz A: ");
            //mostrando matriz 1
            for (i = 0; i < linhas; i++) {
                for (j = 0; j < colunas; j++) {
                    System.out.print(matriz1[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("Matriz B: ");
            //mostrando matriz 2
            for (i = 0; i < linhas2; i++) {
                for (j = 0; j < colunas2; j++) {
                    System.out.print(matriz2[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            double matrizResul[][] = new double[linhas][colunas];
            //Somando matrizes
            System.out.println("Matriz resultante: ");
            for (i = 0; i < linhas; i++) {
                for (j = 0; j < colunas2; j++) {
                    matrizResul[i][j] = matriz1[i][j] - matriz2[i][j];
                    System.out.print(matrizResul[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }

    public static void matrizTransposta() {
        System.out.println("Quantas linhas?");
        int linhas = scan.nextInt();

        System.out.println("Quantas Colunas?");
        int colunas = scan.nextInt();

        double a[][] = new double[linhas][colunas];
        double b[][] = new double[colunas][linhas];
        double c[][] = new double[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz a: ");
                a[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println();

        System.out.println("A transposta da Matriz: ");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static Matriz calculoTransposta(Matriz m) {
        Matriz r = new Matriz(m.getColunas(), m.getLinhas());

        for (int i = 0; i < m.getLinhas(); i++) {
            for (int j = 0; j < m.getColunas(); j++) {
                r.setValor(j, i, m.getValor(i, j));
            }
        }

        return r;
    }

    public static void matrizEscalar() {
        System.out.println("Numero de linhas?");
        int linhas = scan.nextInt();

        System.out.println("Numero de Colunas?");
        int colunas = scan.nextInt();

        double a[][];
        a = new double[linhas][colunas];
        double b[][];
        b = new double[linhas][colunas];
        double n;

        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz a: ");
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite o elemento que deseja multiplicar pela matriz: ");
        n = scan.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                b[i][j] = a[i][j] * n;
            }
        }

        System.out.println();

        System.out.println("O Resultado da multiplicação: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void matrizPotencia() {
        System.out.println("Digite a dimensão da matriz: ");
        int dime = scan.nextInt();

        System.out.println("Digite o expoente que deseja elevar a matriz: ");
        int expo = scan.nextInt();
        
        
        if(expo < 0){
            System.out.println("Caso deseje calcular a inversa tem esta opção no menu!");
            Inicio.novamente();
        }
        
        double ident[][] = new double[dime][dime];//declarando matriz identidade
        for (int i = 0; i < dime; i++) {//preenchendo matriz identidade

            for (int j = 0; j < dime; j++) {

                if (i == j) {

                    ident[i][j] = 1;
                } else {

                    ident[i][j] = 0;
                }
            }
        }
        
        double matriz[][] = new double[dime][dime];

        for (int i = 0; i < dime; i++) {
            System.out.println();
            for (int j = 0; j < dime; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz: ");
                matriz[i][j] = scan.nextDouble();
            }
        }
        

        double matrizResul[][] = new double[dime][dime];
        for (int i = 0; i < dime; i++) {
            for (int j = 0; j < dime; j++) {
                matrizResul[i][j] = matriz[i][j];
            }
        }

        if (expo == 0) {
            for (int i = 0; i < dime; i++) {//colocando a matriz identidade dentro da matriz resultado
                for (int j = 0; j < dime; j++) {
                    matrizResul[i][j] = ident[i][j];
                }
            }

        } else {//multiplicar o resultado pela matriz perguntada
            int valor = 0;
            for (int l = 1; l < expo; l++) {

                double[][] tmp = new double[dime][dime];

                for (int i = 0; i < dime; i++) {

                    for (int j = 0; j < dime; j++) {

                        for (int k = 0; k < dime; k++) {

                            tmp[i][j] += matrizResul[i][k] * matriz[k][j];
                        }

                        valor = 0;
                    }

                }

                matrizResul = tmp;
            }
        }
        System.out.println("Resultado");
        for (int i = 0; i < matrizResul.length; i++) {
            for (int j = 0; j < matrizResul.length; j++) {
                System.out.print(matrizResul[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void multiplicacaoMatriz() {
        System.out.println("Numero de linhas da matriz A?");
        int linhas = scan.nextInt();

        System.out.println("Numero de Colunas da matriz A?");
        int colunas = scan.nextInt();

        System.out.println("Numero de linhas da matriz B?");
        int linhas2 = scan.nextInt();

        System.out.println("Numero de Colunas da matriz B?");
        int colunas2 = scan.nextInt();

        double a[][];
        a = new double[linhas][colunas];
        double b[][];
        b = new double[linhas2][colunas2];
        double c[][];
        c = new double[linhas][colunas2];

        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz a: ");
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < linhas2; i++) {
            System.out.println();
            for (int j = 0; j < colunas2; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz b: ");
                b[i][j] = scan.nextInt();
            }
        }
        int valor = 0;
        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas2; j++) {

                for (int k = 0; k < colunas; k++) {

                    valor += a[i][k] * b[k][j];
                }

                c[i][j] = valor;

                valor = 0;
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("O Resultado da multiplicação das matrizes: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void matrizInversa() {
        System.out.println("Qual a ordem da matriz? ");
        int dime = scan.nextInt();

        Matriz matriz = new Matriz(dime, dime);
        Matriz matrizR = new Matriz(dime, dime);

        for (int i = 0; i < dime; i++) {
            System.out.println();
            for (int j = 0; j < dime; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz: ");
                double temp = scan.nextDouble();
                matriz.setValor(i, j, temp);
                temp = 0;
            }
        }

        matrizR = calculoInversa(matriz);
        if (matrizR == null) {
            System.out.println("Não existe matriz inversa!");
        } else {
            for (int i = 0; i < dime; i++) {
                for (int j = 0; j < dime; j++) {
                    System.out.print(matrizR.getValor(i, j));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }

    public static Matriz calculoInversa(Matriz m) {
        double det = calculoDet(m);

        if (det == 0) {
            return null;
        } else {
            Matriz r = calcAdjunta(m);
            for (int i = 0; i < r.getLinhas(); i++) {
                for (int j = 0; j < r.getColunas(); j++) {
                    r.setValor(i, j, r.getValor(i, j) / det);
                }
            }
            return r;
        }
    }

    public static void matrizCofatora() {//mostrar cofatora
        System.out.println("Digite a dimensão da matriz: ");
        int dime = scan.nextInt();

        Matriz matriz = new Matriz(dime, dime);
        Matriz matrizR = new Matriz(dime, dime);
        
        for (int i = 0; i < dime; i++) {
            System.out.println();
            for (int j = 0; j < dime; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz: ");
                double temp = scan.nextDouble();
                matriz.setValor(i, j, temp);
                temp = 0;
            }
        }
        
        matrizR = calculoCofatora(matriz);

        for (int i = 0; i < dime; i++) {
            for (int j = 0; j < dime; j++) {
                System.out.print(matrizR.getValor(i, j));
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static Matriz calculoCofatora(Matriz m) {//mostrar calculo cofatora
        Matriz r = new Matriz(m.getLinhas(), m.getLinhas());

        for (int i = 0; i < m.getLinhas(); i++) {
            for (int j = 0; j < m.getLinhas(); j++) {
                r.setValor(i, j, oposto(i) * oposto(j) * calculoDet(subMatriz( i, j,m)));
            }
        }

        return r;
    }

    public static void matrizAdjunta() {
        System.out.println("Qual a ordem da matriz? ");
        int dime = scan.nextInt();

        Matriz matriz = new Matriz(dime, dime);
        Matriz matrizR = new Matriz(dime, dime);

        for (int i = 0; i < dime; i++) {
            System.out.println();
            for (int j = 0; j < dime; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz a: ");
                double a = scan.nextDouble();
                matriz.setValor(i, j, a);
                a = 0;
            }
        }

        matrizR = calcAdjunta(matriz);

        for (int i = 0; i < dime; i++) {
            for (int j = 0; j < dime; j++) {
                System.out.print(matrizR.getValor(i, j));
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static Matriz calcAdjunta(Matriz matriz) {

        Matriz tempAjunta = new Matriz(matriz.getLinhas(), matriz.getColunas());

        for (int i = 0; i < tempAjunta.getLinhas(); i++) {
            for (int j = 0; j < tempAjunta.getColunas(); j++) {
                Matriz temp = subMatriz( i, j,matriz);

                double elemento = Math.pow(-1, i + j) * calculoDet(temp);

                tempAjunta.setValor(j, i, elemento);
            }
        }

        return tempAjunta;

    }

    public static Matriz subMatriz(int i, int j, Matriz m) {
        Matriz temp = new Matriz(m.getLinhas() - 1, m.getColunas() - 1);

        int cont1 = 0;
        int cont2 = 0;

        for (int k = 0; k < m.getLinhas(); k++) {
            if (k != i) {
                cont2 = 0;
                for (int l = 0; l < m.getColunas(); l++) {
                    if (l != j) {
                        temp.setValor(cont1, cont2, m.getValor(k, l));
                        cont2++;
                    }
                }
                cont1++;
            }
        }
        return temp;
    }

    public static void determinante() {

        System.out.println("Digite a ordem da matriz: ");
        int dime = scan.nextInt();

        Matriz matriz = new Matriz(dime, dime);
        double det = 0;
        double aux = 0;
        for (int i = 0; i < dime; i++) {
            System.out.println();
            for (int j = 0; j < dime; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz: ");
                aux = scan.nextDouble();
                matriz.setValor(i, j, aux);
            }
        }

        det = calculoDet(matriz);
        System.out.println("");
        System.out.println("O determinante: " + det);
    }

    public static double calculoDet(Matriz m) {//laplace

        if (m.getLinhas() == 1) {

            return m.getValor(0, 0);
        }
        if (m.getLinhas() == 2) {

            return m.getValor(0, 0) * m.getValor(1, 1) - m.getValor(0, 1) * m.getValor(1, 0);
        }

        double det = 0;

        for (int i = 0; i < m.getLinhas(); i++) {

            det += Math.pow(-1, i) * m.getValor(0, i) * calculoDet(subMatriz( 0, i,m));
        }

        return det;
    }

    public static void gauss() {
        System.out.println("Numero de linhas da matriz dos coeficientes?");
        int linhas = scan.nextInt();

        System.out.println("Numero de Colunas da matriz dos coeficientes?");
        int colunas = scan.nextInt();

        double matriz[][] = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz dos coeficientes: ");
                matriz[i][j] = scan.nextDouble();
            }
        }

        double matrizR[][] = new double[linhas][colunas];
        double matrizAux[][] = new double[linhas][colunas];
        double colunaIndep[] = new double[linhas];
        double soma = 0;
        
        for (int i = 0; i < linhas; i++) {
            System.out.println("Digite o termo independente da linha " + i);
            double valor = scan.nextDouble();
            colunaIndep[i] = valor;
        }
        

        Matriz m = new Matriz(linhas,colunas);
        m.setMatriz(matrizR);
        
        for (int i = 0; i < linhas; i++) { 

            //int p = procuraPivor(m, i);

            //eliminacao
            for (int k = i; k < linhas; k++) {

                soma = 0;

                for (int j = 0; j < i; j++) {

                    soma += (matrizAux[i][j] * matrizR[j][k]);
                }

                matrizR[i][k] = (matriz[i][k] - soma);
            }

            for (int k = i; k < linhas; k++) {

                if (i == k) {

                    matrizAux[i][i] = 1;
                } else {

                    soma = 0;

                    for (int j = 0; j < i; j++) {

                        soma += (matrizAux[k][j] * matrizR[j][i]);
                    }

                    matrizAux[k][i] = (matriz[k][i] - soma) / matrizR[i][i];
                }
            }
        }
        System.out.println("");
        
        for (int i = 0; i < linhas; i++) {
                System.out.print(colunaIndep[i]);
                System.out.print(" ");
            System.out.println();
        }
        

        System.out.println("Matriz fatorada por Gauss: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizR[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void fatoracaoLU() {
        System.out.println("Numero de linhas da matriz dos coeficientes?");
        int linhas = scan.nextInt();

        System.out.println("Numero de Colunas da matriz dos coeficientes?");
        int colunas = scan.nextInt();

        double matriz[][] = new double[linhas][colunas];
        double colunaIndep[] = new double[linhas];//vetor com os elementos independentes

        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento linha " + i + " coluna " + j + " da matriz dos coeficientes: ");
                matriz[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < linhas; i++) {
            System.out.println("Digite o termo independente da linha " + i);
            double valor = scan.nextDouble();
            colunaIndep[i] = valor;
        }

        double matrizL[][] = new double[linhas][colunas];
        double matrizU[][] = new double[linhas][colunas];

        double soma = 0;

        for (int i = 0; i < linhas; i++) {

            for (int k = i; k < linhas; k++) {

                soma = 0;

                for (int j = 0; j < i; j++) {

                    soma += (matrizL[i][j] * matrizU[j][k]);
                }

                matrizU[i][k] = (matriz[i][k] - soma);
            }

            for (int k = i; k < linhas; k++) {

                if (i == k) {

                    matrizL[i][i] = 1;
                } else {

                    soma = 0;

                    for (int j = 0; j < i; j++) {

                        soma += (matrizL[k][j] * matrizU[j][i]);
                    }

                    matrizL[k][i] = (matriz[k][i] - soma) / matrizU[i][i];
                }
            }
        }
        System.out.println("Matriz L: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizL[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Matriz U: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizU[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void gaussJordan() {
        System.out.println("ESTÁ OPERAÇÃO ESTÁ INDISPONIVEL NO MOMENTO!");
        Inicio.novamente();
    }
    
    public static void GramS() {
        System.out.println("ESTÁ OPERAÇÃO ESTÁ INDISPONIVEL NO MOMENTO!");
        Inicio.novamente();
    }
    
    private static int oposto(int i) {

        if (i % 2 == 0) {

            return 1;
        } else {

            return -1;
        }
    }
}
