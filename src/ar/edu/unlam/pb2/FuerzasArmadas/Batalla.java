package ar.edu.unlam.pb2.FuerzasArmadas;

public class Batalla {
	String nombre;
	TipoDeBatalla tipo;
	Double latitud;
	Double longitud;

		public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
			this.nombre = nombre;
			this.tipo = tipo;
			this.latitud = latitud;
			this.longitud = longitud;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public TipoDeBatalla getTipo() {
			return tipo;
		}

		public void setTipo(TipoDeBatalla tipo) {
			this.tipo = tipo;
		}

		public Double getLatitud() {
			return latitud;
		}

		public void setLatitud(Double latitud) {
			this.latitud = latitud;
		}

		public Double getLongitud() {
			return longitud;
		}

		public void setLongitud(Double longitud) {
			this.longitud = longitud;
		}
		
		public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
			this.nombre = nombre;
			this.tipo = tipo;
			this.latitud = latitud;
			this.longitud = longitud;
		}

		public void crearBatalla(Batalla batalla) {
			// TODO Auto-generated method stub
			
		}

}
