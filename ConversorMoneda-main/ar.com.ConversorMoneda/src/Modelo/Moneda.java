package Modelo;

public class Moneda {

	private String nombre;
		
	public Moneda(String nombre, double valorCompra, double valorVenta) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String convertirMoneda(double cantidad, String tipoDeCambio) {
		switch (tipoDeCambio) {
			case "De peso a dolar": {
				double cantidadObtenida = cantidad * 0.0016;
				return "Cambiaste " + cantidad + " pesos por " + cantidadObtenida + " dolares"; 
				
			}
			case "De peso a euro": {
				double cantidadObtenida = cantidad * 0.0015;
				return "Cambiaste " + cantidad + " pesos por " + cantidadObtenida + " euros";
				
			}
			case "De peso a libra": {
				double cantidadObtenida = cantidad * 0.0018;
				return "Cambiaste " + cantidad + " pesos por " + cantidadObtenida + " libras";
				
			}
			case "De peso a yen": {
				double cantidadObtenida = cantidad * 0.5;
				return "Cambiaste " + cantidad + " pesos por " + cantidadObtenida + " yenes";
				
			}
			case "De peso a won coreano": {
				double cantidadObtenida = cantidad * 4.63;
				return "Cambiaste " + cantidad + " pesos por " + cantidadObtenida + " won coreano";
				
			}
			case "De dolar a peso": {
				double cantidadObtenida = cantidad * 288;
				return "Cambiaste " + cantidad + " dolares por " + cantidadObtenida + " pesos";
				
			}
			case "De euro a peso": {
				double cantidadObtenida = cantidad * 315;
				return "Cambiaste " + cantidad + " euros por " + cantidadObtenida + " pesos";
				
			}
			case "De libra a peso": {
				double cantidadObtenida = cantidad * 364;
				return "Cambiaste " + cantidad + " libras por " + cantidadObtenida + " pesos";
			
			}
			case "De yen a peso": {
				double cantidadObtenida = cantidad * 1.98;
				return "Cambiaste " + cantidad + " yenes por " + cantidadObtenida + " pesos";
			
			}
			case "De won coreano a peso": {
				double cantidadObtenida = cantidad * 0.22;
				return "Cambiaste " + cantidad + " won coreanos por " + cantidadObtenida + " pesos";
			
			}
			default:{
				return "Ocurrió un error";
			}
		}
	}
}