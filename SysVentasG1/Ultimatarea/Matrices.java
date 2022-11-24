public class Matrices {
    Scanner cs = new Scanner(System.in);

    public void transformada09() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz[0].length - 1) - f; c <= matriz[0].length - 1; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada10() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i - j] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada11() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz.length - 1) - f; c >= 0; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada12() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[f].length - 1; c >= f; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada18() {

        System.out.println("TRANSFORMADA 18");

        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[c][(dimension - 1) - f] = "" + valor;
                valor++;
            }
        }
        imprimirMatriz(matriz);
        System.out.println("");
    }

    public void transformada20() {

        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = le.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = le.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = (matriz[0].length - 1); f >= 0; f--) {
            for (int c = matriz[f].length - 1; c >= f; c--) {
                matriz[c][f] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada22() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = le.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = le.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz[0].length; c++) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void transformada23() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = le.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = le.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = (matriz[0].length - 1); c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }
        }

    public void transformada24() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = matriz[0].length - 1; columna >= 0; columna--) {
            if (columna % 2 == 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void transformada25() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void transformada26() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la  Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void transformada27() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor = 0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila = matriz.length - 1; fila >= 0; fila--) {
            if (fila % 2 == 0) {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada28() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = (matriz.length - 1); f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada30() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void transformada31() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la  matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void transformada32() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c] == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(m[f][c] + "\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Transformadas().transformada18();
}
