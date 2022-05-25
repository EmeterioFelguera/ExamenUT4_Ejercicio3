/**
 * Clase principal del ejercicio3
 * @author Alumno_05
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		/**
		 * Creamos el array para después comprobarlo en el método
		 * @author Emeterio
		 */
		String [] arrayPersonas = {"ANA","LUIS","ANTONIO","MANUEL"};
		
		/**
		 * Llamamos al método para comprobar el array
		 * 
		 */
		contarVocales(arrayPersonas);

	}

	
	/**
	 * Metodo que cuenta las vocales que contiene el array que le pasamos por parámetro
	 * @param arrayPersonas
	 */
	
	static public void contarVocales(String [] arrayPersonas) {
		
		int a=0, e=0, i=0, o=0, u=0, contador;
		char letra;
		
		/**
		 * Este bucle saca las palabras del array para obtener su longitud y posteriormente trabajar con ellas
		 */
		for (int j = 0; j < arrayPersonas.length; j++) {
			contador = arrayPersonas[j].length();
			
			/**
			 * Este segundo bucle, recorre la palabra silaba por silaba para comprobar si es una vocal, y en el caso de que sea, le suma +1 
			 * según la vocal.
			 */
			for (int j2 = 0; j2 < contador; j2++) {
				letra = arrayPersonas[j].charAt(j2);
				
				switch (letra) {
				case 'A':
					a++;
					break;
				case 'E':
					e++;
					break;
				case 'I':
					i++;
					break;
				case 'O':
					o++;
					break;
				case 'U':
					u++;
					break;

				default:
					break;
				}
			}
		}
		
		/**
		 * Imprimimos las vocales con la cuenta ya realizada
		 */
		System.out.println("Numero de vocales a: " + a
				+ "\nNumero de vocales e: " + e
				+ "\nNumero de vocales i: " + i
				+ "\nNumero de vocales o: " + o
				+ "\nNumero de vocales u: " + u);
	}
}
