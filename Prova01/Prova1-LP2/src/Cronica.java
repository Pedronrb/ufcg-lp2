public class Cronica {
	
	private String titulo;
	private String texto;
	private String autor = "Anônimo";
	private String data;
	private int indice = 0;
	private int lidas = 0;
	
	public Cronica(String titulo, String texto, String data) {
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
	}
	
	public Cronica(String titulo, String texto, String data, String autor) {
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getLidas() {
		return lidas;
	}

	public void setLidas(int lidas) {
		this.lidas = lidas;
	}
	
	public String toString() { 
		  return "Cronica #" + this.indice + "\n" + this.titulo + "\n" + "Data: " + 
		    		this.data + "\n" + "Autor: " + this.autor + "\n" + this.texto;
	}
	
}

 



	