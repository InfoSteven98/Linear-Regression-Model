package ccs7;
import java.util.Scanner;


public class CCS7 {
    
    //global variable declaration
    static Scanner yLabel = new Scanner(System.in);
    static Scanner xFeature = new Scanner(System.in);
    static float sumA = 0;
    static float sumB = 0;        
    static float sumXSquare = 0;
    static float sumXY = 0;
    static float abSum = 0;
    static float[] arrayA = new float[10];
    static float[] arrayB = new float[10];

    public static void main(String[] args) {
        xyInput(); 
        xSquare();
        Table();
        abFormula(); 
}
    
    public static void xyInput(){
        System.out.println("input for array a");
            for(int i = 0; i < 10; i++){
                arrayA[i] = xFeature.nextInt();
                sumA = sumA + arrayA[i];        
            }
            
        //y input       
        System.out.println("input for array b");
            for(int j = 0; j < 10; j++){
                arrayB[j] = yLabel.nextInt();
                sumB = sumB + arrayB[j];
            }
    }

    public static float xSquare(){
    
        for (int i = 0; i < arrayA.length; i++) {
             sumXSquare += (int) Math.pow(arrayA[i], 2);
        }
        return sumXSquare;
    }
    
    public static void abFormula(){

            //formula a, b, y
            float formulaA =((sumB*sumXSquare)-(sumA*sumXY))/(10*sumXSquare-(sumA*sumA));
            float formulaB =(10*sumXY-sumA*sumB)/(10*sumXSquare-(sumA*sumA));
            
            //printing the values
            System.out.println("a = "+formulaA+"\tb = "+formulaB+"\n"+"Y = " + formulaA +" "+ formulaB+"X");
    }
    
    public static void Table(){
        System.out.println("xFeature\tyLabel\tx^2\txy");
        for(int k = 0; k <10; k++){
            float xy = arrayA[k]*arrayB[k];
            System.out.println(arrayA[k] + "\t\t" + arrayB[k]+"\t"+(int)Math.pow(arrayA[k], 2)+"\t" + xy);
            sumXY = sumXY + xy;
        }  
        System.out.println(sumA+"\t\t"+sumB+"\t"+sumXSquare+"\t"+sumXY+"\n");
    }
}


