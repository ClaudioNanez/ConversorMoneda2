package Modelo;

public class Temperatura {
	private String nombre;

	public Temperatura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
    public static String convertirTemperatura(double cantidad, String tipoDeCambio) {
		switch (tipoDeCambio) {
			case "De Celsius a Farenheit":{
				double temperatura = (cantidad * 9 / 5) + 32;
		        return cantidad + " grados celsius igual a " + temperatura + "grados fahrenheit.";
			}
			case "De Farenheit a Celsius":{
				double temperatura = (cantidad - 32) * 5 / 9;
		    	return cantidad + " grados fahrenheit igual a " + temperatura + "grados celsius.";
			}
			default:{
				return "Ocurrió un error";
			}
				
		}
	
    }
	

}