
import java.util.Arrays;

public class Livreto {
	
	private Cronica[] cronicas;
	private int indice = 0;
	
	public Livreto() {
		cronicas = new Cronica[5];

	}
	
	public Cronica[] getCronicas() {
		return cronicas;
	}

	public void setCronicas(Cronica[] cronicas) {
		this.cronicas = cronicas;
	}

	public boolean contemCronicaNoLivreto(String titulo) {
		for (int i = 0; i < cronicas.length; i++) {
			if(cronicas[i] != null && cronicas[i].getTitulo().equals(titulo)) {
				return true;
			}
		}
		return false;
	}
	
	public void adicionaCronica(Cronica cronica) {
		cronicas[indice] = cronica;
		indice += 1;
	}

	@Override
	public String toString() {
		return "Livreto [cronicas=" + Arrays.toString(cronicas) + ", indice=" + indice + ", getCronicas()="
				+ Arrays.toString(getCronicas()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}

