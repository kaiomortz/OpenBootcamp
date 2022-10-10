
public class Ejercicio_Tema_3_Parte_2_Coche {
	
	public static void main(String[] args) {
		

		coche miCoche= new coche();
		
		miCoche.masPuertas();
		
		System.out.println(miCoche.numeroPuertas);
		
    
	
	
	}	
	
	
}
	
class coche{
	
	public int numeroPuertas=4;
	
	public void masPuertas(){
		
		this.numeroPuertas++;
	}
	
	
}
	
			
	


