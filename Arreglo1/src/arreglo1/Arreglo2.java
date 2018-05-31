
package arreglo1;


public class Arreglo2 {
    public static void main(String[] args) {
        //Inicializacion de Variables
        int[]c=new int[7];
        c[0]=1;
        c[1]=2;
        c[2]=3;
        c[3]=4;
        c[4]=5;
        c[5]=6;
        c[6]=7;
        int mult=0;
        int contador2=1;
        
        //Lenght ->(Numero de datos en el arreglo)
        for(int contador=0;contador<c.length;contador++){
            //System.out.println(c[contador]);
            if (c[contador]%2==0){
                for(contador2=0;contador2<=12;contador2++){
                    mult=c[contador]*contador2;
                                System.out.printf("%d x %d =%d\n" ,c[contador],contador2,mult);
                    
                }
                
            }

        }
    
    }
}
