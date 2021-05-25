package trabalhoalgebralinearfinal;

import java.util.InputMismatchException;
import java.util.Scanner;
import trabalhoalgebralinearfinal.Operações;

public class Inicio {

    public static Scanner scan = new Scanner(System.in);

    public static void menuPrincipal() {

        char op;
        while (true) {
            System.out.println("+*************************************************+");
            System.out.println("|>>>>>BEM VINDO AO PROGRAMA DE ÁLGEBRA LINEAR<<<<<|");
            System.out.println("|                                                 |");
            System.out.println("|ESCOLHA A CATEGORIA DE OPERAÇÕES DESEJADA:       |");
            System.out.println("|                                                 |");
            System.out.println("| 1 para Álgebra Matricial                        |");
            System.out.println("| 2 para Sistemas                                 |");
            System.out.println("| 3 para Gram Schmidt(NÃO ESTÁ FUNCIONANDO)       |");
            System.out.println("| 0 para Sair                                     |");
            System.out.println("|                                                 |");
            System.out.println("+*************************************************+");
            System.out.print("\n ");
            op = scan.next().charAt(0);
            
            
            switch (op) {

                case '1':
                    algebraMatricial();
                    break;

                case '2':
                    sistemas();
                    break;

                case '3':
                    Operações.GramS();
                    Inicio.novamente();
                    break;

                case '0':
                    System.exit(0);
            }
        }
    }

    public static void algebraMatricial() {

        int op;
        while (true) {
            System.out.println("+*******************************************************+");
            System.out.println("|>>>>>>>BEM VINDO AO MENU DE ÁLGEBRA MATRICIAL<<<<<<<<<<|");
            System.out.println("|                                                       |");
            System.out.println("| ESCOLHA A OPERAÇÃO DESEJADA:                          |");
            System.out.println("|                                                       |");
            System.out.println("| 1 para Adição                                         |");
            System.out.println("| 2 para Subtração                                      |");
            System.out.println("| 3 para Multiplicação por escalar                      |");
            System.out.println("| 4 para Multiplição                                    |");
            System.out.println("| 5 para Transposição                                   |");
            System.out.println("| 6 para Potenciação                                    |");
            System.out.println("| 7 para Inversa                                        |");
            System.out.println("| 8 para Cofatora                                       |");
            System.out.println("| 9 para Adjunta                                        |");
            System.out.println("| 10 para Determinante                                  |");
            System.out.println("| 0 para voltar para o menu principal                   |");
            System.out.println("+*******************************************************+");
            System.out.print("\n ");

            try {
                op = scan.nextInt();
            } catch (InputMismatchException ex) {
                op = -1;
            }
            switch (op) {
                
                case 0: {
                    menuPrincipal();
                    break;
                }
                
                case 1: {
                    Operações.somarMatriz();
                    break;
                }

                case 2: {
                    Operações.subtrairMatriz();
                    break;
                }

                case 3: {
                    Operações.matrizEscalar();
                    break;
                }

                case 4: {
                    Operações.multiplicacaoMatriz();
                    break;
                }

                case 5: {
                    Operações.matrizTransposta();
                    break;
                }

                case 6: {
                    Operações.matrizPotencia();
                    break;
                }

                case 7: {
                    Operações.matrizInversa();
                    break;
                }

                case 8: {
                    Operações.matrizCofatora();
                    break;
                }

                case 9: {
                    Operações.matrizAdjunta();
                    break;
                }

                case 10: {
                    Operações.determinante();
                    break;
                }
            }

            Inicio.novamente();
        }
    }

    public static void novamente() {
        char op;
        while (true) {
            System.out.println("+************************************************+");
            System.out.println("|                                                |");
            System.out.println("| 1 caso queira realizar outra operação          |");
            System.out.println("| 0 Caso queira sair                             |");
            System.out.println("|                                                |");
            System.out.println("+************************************************+");
            System.out.print("\n ");

            op = scan.next().charAt(0);

            if (op == '1') {

                Inicio.menuPrincipal();
            }

            if (op == '0') {

                System.exit(0);
            }
        }
    }
    
    public static void sistemas(){
         char op;
        while (true) {
            
            System.out.println("+************************************************+");
            System.out.println("|>>>>>>>>>>BEM VINDO AO MENU SISTEMAS<<<<<<<<<<<<|");
            System.out.println("|                                                |");
            System.out.println("|Escolha o método:                               |");
            System.out.println("|                                                |");
            System.out.println("| 1 para Gauss                                   |");
            System.out.println("| 2 para Gauss-Jordan(NÃO ESTÁ FUNCIONANDO)      |");
            System.out.println("| 3 para Fatoração LU                            |");
            System.out.println("| 4 para voltar ao menu principal                |");
            System.out.println("|                                                |");
            System.out.println("+************************************************+");
            System.out.print("\n ");

            op = scan.next().charAt(0);

            if (op == '1') {

                Operações.gauss();
            }

            if (op == '2') {

                Operações.gaussJordan();
            }
            if (op == '3'){
                Operações.fatoracaoLU();
            }
            if (op == '4'){
                menuPrincipal();
            }
            
        }
    }
}
