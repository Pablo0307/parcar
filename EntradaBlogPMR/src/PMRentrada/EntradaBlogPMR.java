package PMRentrada;
/**
 * Clase para manejar las entradas de un blog.
 * @author Pablo Mart�nez Ruiz
 * @since 15/03/2021
 * @version 2.3
 */

public class EntradaBlogPMR {
	/**
	 *separador es el car�cter que separa ENTRADA DE del
	 *nombre del autor
	 */
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		public EntradaBlogPMR(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		}
		/**
		 * Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
		 *de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
		 *es negativo, lanza una excepci�n.
		 * @param id
		 * @param autor
		 * @param texto
		 * @throws IllegalArgumentException
		 */
		public void EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * Devuelve el n�mero de la entrada
		 * @return id 
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * devuelve el texto completo de la entrada
		 * @return texto
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * devuelve el nombre del autor de la entrada en may�sculas
		 * @return autor
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		
		/**
		 * llama y saca por pantalla los metodos anteriormente creados
		 * @param args
		 */
		public static void main(String[] args) {
	            
			EntradaBlogPMR e1 = new EntradaBlogPMR (-3,"TU_NOMBRE","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
}
