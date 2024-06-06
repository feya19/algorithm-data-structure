package Graph.Praktikum2;

public class GraphMatriks10 {
    int vertex;
    int[][] matriks;
    
    public GraphMatriks10(int v){
        vertex = v;
        matriks = new int[v][v];
    }
    
    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }
    
    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }
    
    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                System.out.print("Gedung " + (char)('A' + j) + " (" + matriks[i][j] + " m),");
            }
            System.out.println();
        }
    }

    public void showDegree(int asal){
        int sumIn = 0, sumOut = 0;
        for(int i = 0; i < vertex; i++){
            if (matriks[i][asal] != 0) {
                sumIn++;
            }
        }
        for (int i = 0; i < vertex; i++) {
            if (matriks[asal][i] != 0) {
                sumOut++;
            }
        }
        System.out.println("InDegree dari gedung " + (char)('A' + asal) + " : " + sumIn);
        System.out.println("OutDegree dari gedung " + (char)('A' + asal) + " : " + sumOut);
        System.out.println("Degree dari gedung " + (char)('A' + asal) + " : " + (sumIn + sumOut)); 
    }
}
