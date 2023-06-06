package simulado2;


public class Acao {
	private int id;
	private String data;
	
	public Acao(String data, int id) {
		this.data = data;
		this.id = id;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return "Acao " + this.id + " - " + this.data + " - ";
		
	}
	
	
	
}


