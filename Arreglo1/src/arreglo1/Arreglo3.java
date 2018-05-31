
package arreglo1;

public class Arreglo3 {
    public static void main(String[] args) {
        double[]calificaciones_progr={18,19,15,16,17,10};
        double[]calificaciones_bd={10,12,13,20,17,20};
        double[]promedios=new double[6];



        
        
        
        for(int contador=0;contador<calificaciones_bd.length;contador++){
            double suma=calificaciones_progr[contador]+calificaciones_bd[0];
            double promedio=suma/2;
            promedios[contador]=promedio;
        }
        for(int contador2=0;contador2<promedios.length;contador2++){
            System.out.printf("Est%d\t%.2f\t%.2f\t%.2f\n",contador2,calificaciones_progr[contador2],calificaciones_bd[contador2],promedios[contador2]);
        }
                
        
    }
    
}
