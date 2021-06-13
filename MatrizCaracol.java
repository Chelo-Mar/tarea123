public class MatrizCaracol
{
    private int[][] matriz;
    private boolean[][] matrizAux;
    private int orden;
    MatrizCaracol(int orden){
        this.orden = orden;
        if(orden > 0){
            matriz = new int[orden][orden];
            matrizAux = new boolean[orden][orden];
        }       
    }
    public void recorridoCaracol(){
        int i = 0;
        int j = 0;
        int tope = matriz.length - 1;
        int bajo = 0;
        int cont = 1;
        while(cont <= Math.pow(matriz.length, 2.0)){
            while(j <= tope){
                matriz[i][j]= cont;
                cont++;
                j++;
            }
            j--;
            i++;
            while(i <= tope){
                matriz[i][j]= cont;
                cont++;
                i++;
            }
            i--;
            j--;
            tope--;
            while(j >= bajo){
                matriz[i][j] = cont;
                cont++;
                j--;
            }
            j++;
            i--;
            if(bajo == 0){
                bajo++; 
            }else {
                bajo++;
            }
            while(i >= bajo){
                matriz[i][j] = cont;
                cont++;
                i--;
            }
            i++;
            j++;
        }
    }

    public int getOrden(){
        return orden;
    }
}