package model;

public class Persona {
	//atributos
		private String nombre;
		private String email;
		private int telefono;
		//constructor
		public Persona(String nombre, String email, int telefono) {
			super();
			this.nombre = nombre;
			this.email = email;
			this.telefono = telefono;
		}
		//setter y getter
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
}

