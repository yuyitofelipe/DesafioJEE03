package cl.praxis.models;

import java.util.Arrays;

public class Calculadora {
    private int valor1;
    private int valor2;

    
    public String sumar(int valor1, int valor2) {
        return "El resultado de la suma es: " + Integer.toString(valor1 + valor2);
    }

    public String restar(int valor1, int valor2 ){
    	return "El resultado de la resta es: " + Integer.toString(valor1 - valor2);
    }

    public String multiplicar(int valor1, int valor2) {
    	return "El resultado de la multiplicación es: " + Integer.toString(valor1 * valor2);
    }

    public String dividir(int valor1, int valor2) {
            	return "El resultado de la división es: " + Integer.toString(valor1 / valor2);
        }
    

    public  String ordenarNumero(int valor1, int valor2) {
    	int [] nums = {valor1, valor2};
    	Arrays.sort(nums);
    	return "Los números ordenados son: " + Arrays.toString(nums); 	
     }
    
    public String parOImpar(int valor1, int valor2) {
    	if (valor1 %2==0 && valor2 %2==0) {
    		
    		return "Ambos números son pares: " + valor1+ " , " + valor2;
    		
		}else if (valor1 %2==0) {
			return "El número " +valor1 +" Es par y el número "+valor2+ " Es impar" ;
		} 
    	return "El número " +valor2 +" Es par y el número "+valor1+ " Es impar" ;
     }
    
    public boolean esCero(int valor) {
    	if(valor%2==0) {
    		return true;
    	}
    	return false;
		
    }
    public boolean validarEnteros (String valor1, String valor2 ) {
    	
    	boolean resultado;

		try {
			Integer.parseInt(valor1);
			Integer.parseInt(valor2);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
    	 
    }    
    
    public Calculadora() {
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }



}