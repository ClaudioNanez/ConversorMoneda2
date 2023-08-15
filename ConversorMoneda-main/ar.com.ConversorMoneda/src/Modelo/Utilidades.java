package Modelo;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Utilidades {
	
	// Menu principal
	
	public static void MenuPrincipal() {
		String[] opciones = { "Convertir monedas", "Convertir temperaturas" };
		JComboBox<String> opcionConversor = new JComboBox<String>(opciones);
		
		int opcionSeleccionada = JOptionPane.showOptionDialog(null, opcionConversor, "Seleccione una opción",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		if (opcionSeleccionada == JOptionPane.OK_OPTION) {
            String opcionElegida = (String) opcionConversor.getSelectedItem();      
            
            switch (opcionElegida) {
            	case "Convertir monedas":
            		MenuConversorMonedas();
            		break;
            	case "Convertir temperaturas":
            		MenuConversorTemperaturas();
            		break;
            }
		} else if (opcionSeleccionada == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
            
	}

	public static void MenuConversorMonedas() {
    	
		String[] opcionesDeCambio = {"De peso a dolar",
									"De peso a euro",
									"De peso a libra",
									"De peso a yen",
									"De peso a won coreano",
									"De dolar a peso",
									"De euro a peso",
									"De libra a peso",
									"De yen a peso",
									"De won coreano a peso"};
		
		JComboBox<String> opcionesConversorMonedas = new JComboBox<String>(opcionesDeCambio);
		int opciondeCambio = JOptionPane.showOptionDialog(null, opcionesConversorMonedas,
				"Seleccione el cambio que desea hacer",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		String cambioMoneda = (String)opcionesConversorMonedas.getSelectedItem();
				
		if (opciondeCambio == JOptionPane.OK_OPTION ) {			
			try {
				double cantidad = obtenerValorNumerico();
				String cantidadObtenida = Moneda.convertirMoneda(cantidad, cambioMoneda);
				JOptionPane.showMessageDialog(null, cantidadObtenida);
				regresoMenuPrincipal();
			}catch (NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Operación Cancelada");
				regresoMenuPrincipal();
			}	
	
		}else if (opciondeCambio == JOptionPane.CANCEL_OPTION ) {
			JOptionPane.showMessageDialog(null, "Operación Cancelada");
			regresoMenuPrincipal();			
			
		}
    }
    
    public static void MenuConversorTemperaturas() {
    	String[] opcionesDeCambioDeTemperatura = {"De Celsius a Farenheit",
    											 "De Farenheit a Celsius"};
    	
		JComboBox<String> opcionesConversorTemperaturas = new JComboBox<String>(opcionesDeCambioDeTemperatura);
		
		int opciondeCambiodeTemperatura = JOptionPane.showOptionDialog(null, opcionesConversorTemperaturas,
				"Seleccione el cambio que desea hacer",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		String cambioTemperatura = (String) opcionesConversorTemperaturas.getSelectedItem();
		
		if (opciondeCambiodeTemperatura == JOptionPane.OK_OPTION ) {
			
			try{
				double cantidad = obtenerValorNumerico();
				String cantidadObtenida = Temperatura.convertirTemperatura(cantidad, cambioTemperatura);
				JOptionPane.showMessageDialog(null, cantidadObtenida);
				regresoMenuPrincipal();
			}catch (NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Cancelaste la operacion");
				regresoMenuPrincipal();
			}
	
		}else {
			JOptionPane.showMessageDialog(null, "Cancelaste la operacion");
			regresoMenuPrincipal();
			
		}
    }
	
	public static double obtenerValorNumerico() {
        double valor = 0.0;
        boolean valorValido = false;

        while (!valorValido) {
            String input = JOptionPane.showInputDialog("¿Cuánto quieres cambiar?");

            try {
                valor = Double.parseDouble(input);
                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un valor numérico válido.");
            }
        }

        return valor;
    }
	
	public static void regresoMenuPrincipal() {
		String[] opciones = {"Si", "No", "Cancelar"};
		int seleccion = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "...", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		
		if (seleccion == 0) {
			MenuPrincipal();
		}else {
			JOptionPane.showMessageDialog(null, "El programa ha finalizado.");
		}
	
	}

}