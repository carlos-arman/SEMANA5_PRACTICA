public class MasaCorporal extends persona{
    //. Crear  un  programa  que  calcule  el  índice  de  masa 
    // corporal  de  una  persona  según  la siguiente formula e 
    // indique el estado en el que se encuentra esa persona en
    // función del valor de IMC..
  
    
    public double IMC = 0;

    public void MasaC(){
        double exponente = 2;
        
        double resultExpo;
        resultExpo = peso / (Math.pow(estatura, exponente));

        System.out.println("Su MCI es: " + resultExpo);
        
        
        if(resultExpo < 18){
            System.out.println("Clasificación: Peso bajo. Necesario valorar signos de desnutricion");
        }else if(resultExpo >= 18 && resultExpo <=24.9){
            System.out.println("Clasificación: Normal");
        }else if(resultExpo >= 25 && resultExpo <=26.9){
            System.out.println("Clasificación: Clasificación!Sobrepeso");
        }else if(resultExpo > 27){
            System.out.println("Clasificación: Obesidad");
        }else if(resultExpo >= 27 && resultExpo <=29.9){
            System.out.println("Clasificación: Obesidad grado I.Riesgo relativoaltopara desarrollar enfermedades cardiovasculares");
        }else if(resultExpo >=30 && resultExpo <=39.9){
            System.out.println("Clasificación: Obesidad grado II.Riesgo relativomuy altopara el desarrollode enfermedades cardiovasculares");
        }else{
            System.out.println("Clasificación: Obesidad grado III Extrema o Mórbida.Riesgo relativoextremadamente altopara el desarrollo de enfermedades cardiovasculares");
        }
    }
    
    

}