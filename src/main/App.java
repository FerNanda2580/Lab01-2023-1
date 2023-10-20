package main;
public class App {
        public static int encontre(int[] arrayOrdenado, int num){

          int esq = 0;
          int dir = arrayOrdenado.length - 1;

          while (esq <= dir){
            int mei = esq + (dir - esq) /2;
            if (arrayOrdenado[mei] == num){
                return 1;
            }
            if (arrayOrdenado[mei]< num){
                esq = mei + 1;
            }
            else {
                dir = mei - 1;
            }
        }
        return 0;

}

    public static int maior(int[] arrayDesordenado){
        
        if(arrayDesordenado.length == 0){
            System.out.println("Vazio");
        }

        int maiorNum = arrayDesordenado[0];
        for (int i = 1; i < arrayDesordenado.length; i++){ 
    
           
            if (arrayDesordenado[i] > maiorNum){

                maiorNum = arrayDesordenado[i];
                
            }
        }
        
        return maiorNum;
        
    }
            


    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
 