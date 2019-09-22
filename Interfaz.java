import java.util.Scanner;
public class Interfaz {
	private Scanner entrada;
	private int Opcion;
	private double Punto = (double x, double y);
	
	public void setOpcion(int Opcion){
		this.Opcion = Opcion;
	}
	public int getOpcion(){
		return Opcion;
	}
	
    public Interfaz(){     
        entrada = new Scanner(System.in);
    }

	public int EscogerOpcion(String mensaje){
       int numero = -14;
       System.out.println(mensaje);
       String respuesta = entrada.next();
       try {
          numero = Integer.parseInt( respuesta );  
       }
       catch(Exception e){
          numero = -14;
       }
              
       return numero;
    }
	
	public int ConfigurarSets(){
		int numero = 2;
		System.out.println("Digite la cantidad de sets para el juego");
		String respuesta = entrada.next();
		try {
			numero = Integer.parseInt(respuesta);
		}
		catch(Exception e){
			System.out.println("Se configuraron 2 sets por default al notar que no se ingreso un numero entero.");
			numero = 2;
		}
		return numero;	
	}
	
	public int ConfigurarTiros(){
		int numero = 3;
		System.out.println("Digite la cantidad de tiros para el juego");
		String respuesta = entrada.next();
		try {
			numero = Integer.parseInt(respuesta);
		}
		catch(Exception e){
			System.out.println("Se configuraron 3 tiros por default al notar que no se ingreso un numero entero.");
			numero = 3;
		}
		return numero;	
	}

	public double PedirPunto(String dato){
		System.out.println("Digite el valor "+dato+" para el punto de tiro (que sea dentro del rango de 0 a 1)");
		
		
		
	}
	
	public void VerPuntaje(String mensaje){
		System.out.println(mensaje);
	}


}