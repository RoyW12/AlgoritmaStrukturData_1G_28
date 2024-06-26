package P15;

public class GraphMain27 {
    public static void main(String[] args) throws Exception {

        GraphMatriks27 gdg = new GraphMatriks27(4);

        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        for (int i = 0; i < 4; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": InDegree = " + gdg.inDegree(i) + ", OutDegree = "
                    + gdg.outDegree(i) + ", Total Degree = " + gdg.degree(i));
        }
    }
}
