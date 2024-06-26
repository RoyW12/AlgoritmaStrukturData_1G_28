package P15;

public class GraphMatriks27 {
    int vertex;
    int[][] matriks;

    public GraphMatriks27(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + "(" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    public int inDegree(int gedung) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][gedung] != 0) {
                inDegree++;
            }

        }
        return inDegree;
    }

    public int outDegree(int gedung) {
        int OutDegree = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[gedung][j] != 0) {
                OutDegree++;
            }
        }
        return OutDegree;
    }

    public int degree(int gedung) {
        return inDegree(gedung) + outDegree(gedung);
    }

}
