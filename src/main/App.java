package main;
public class App {
        public static int encontre(int[] arrayOrdenado, int num){

          for (int i = 0; i<arrayOrdenado.length; i++){
            if (arrayOrdenado [1] == num ){
             
                return 1;
         }
           
            else {
               return 0;  
        }

    }
    return -1;

        
    }

    public static int maior(int[] arrayDesordenado){
        int m = 0; 
        for (int i = 0; i<arrayDesordenado.length; i++){
            if (m<arrayDesordenado[i]){
               (m=arrayDesordenado[i]);

                
            }


        }



        return -1;

    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
 