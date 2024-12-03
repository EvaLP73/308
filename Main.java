package Ej308;

public class Main {

	public static void main(String[] args) {
		// INSTANCIAR EL MODELO, LA VISTA Y EL CONTROLADOR
        // ARRANCAR LA VISTA Y ESTABLECERLE EL CONTROLADOR
		// ACTUALIZAR LA TABLA CON LA LISTA DE TODOS LOS ALUMNOS

				Modelo modelo = new Modelo();

				Vista vista = new Vista();

				Controlador controlador = new Controlador(modelo, vista);

				vista.arrancar();

				vista.setControlador(controlador);

				controlador.actualizarTabla();
			}
}
