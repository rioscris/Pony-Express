package pony;

public class Correo {
	/**
	 * @param estaciones es la distancia en millas de una estación hasta la otra
	 * @returns la cantidad de jinetes necesarios para enviar el correo desde un
	 * extremo hasta el otro del recorrido
	 */
	public static int jinetes(int[] estaciones) {
		int jinetes=1;
		int millasRecorridas=0;
		for (int i=0; i<estaciones.length; i++) {
			if(estaciones[i]>100)
				return -1; // Entrada inválida, no puede recorrer mas de 100 millas sin estación intermedia
			if(millasRecorridas+estaciones[i]>100)
			{
				jinetes++;
				millasRecorridas=estaciones[i];
			}
			else
				millasRecorridas+=estaciones[i];
		}
		return jinetes;
	}
}
