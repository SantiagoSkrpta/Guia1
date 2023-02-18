package guia1_parte1;

import static java.lang.Math.PI;

public class Guia1_calculadora {
//atributos
    public float num1;
    public float num2;
    private float result;
    public float c1;
    public String x;
   
    
    
    //metodos
    public void suma(){
        result=num1+num2;
    }
    
    public float resta(float n1, float n2){
        return n1-n2;
    }
    
    public float division(float n1, float n2){
        return n1/n2;
    }
    
    public float multip(float n1, float n2){
        return n1*n2;
    }
    
    public double coseno(double a){
        if(x=="RAD"){
           c1=(float) (a*PI/180); 
      }else{
      c1=num1;
      }
        return Math.cos(c1);
    }
    
    public double seno(double a){
      if(x=="RAD"){
           c1=(float) (a*PI/180); 
      }else{
      c1=num1;
      }
       return Math.sin(c1);
      
    }
    
    public double tang(double a){
        if(x=="RAD"){
           c1=(float) (a*PI/180); 
      }else{
      c1=num1;
      }
        return Math.tan(c1);
    }
    
    public double potencia(double a, double b){
        return Math.pow(a,b);
    }
    
    public double raiz(double a, double b){
        return Math.pow(b,(1/a));
    }
    
    public float IVA(float a){
        return (float) (a*0.19);
    }
    
    public Double expo(float a){
        return  Math.exp(a);
    }
    
    public Double logt(float a){
        return  Math.log10(a);
    }
    
    public Double arcsin(float a){
        if(x=="RAD"){
           c1=(float) (a*PI/180); 
      }else{
      c1=num1; 
      }
        return  Math.asin(c1);
    }
    
    public Double arccos(float a){
        if(x=="RAD"){
           
           c1=(float) (180/PI*num1); 
      }else{
      c1=num1;
      }
        return  Math.acos(c1);
    }
    
    public Double arctan(float a){
        if(x=="RAD"){
           c1=(float) (a*PI/180); 
      }else{
      c1=num1;
      }
        return  Math.atan(c1);
    }
    
    //metodo costructor
    
    public Guia1_calculadora(){
        num1=0;
        num2=0;
        result=0;
    }
    public Guia1_calculadora(float a, float b, float c){
    
        num1=a;
        num2=b;
        result=c;
}
    //metodo consultor
    public float getResult(){
        return result;
    }
    //metodo modificador de num1
    public void setNum1(float a){
      num1=a;
    }

}
 