
package HugsAndSmiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteDogHost {
	DogHost anfitriao;
	Dog dog;
	Dog dog2;
	
	@BeforeEach
	void preparaHost() {
	this.anfitriao = new DogHost("dh1", 3, 500);
	}
	
	@BeforeEach
	void preparaDog() {
	this.dog = new Dog("Julie", "André", 100);
	this.dog2 = new Dog("Toto", "Pedro", 1);
	}
	
	
	@Test
	void testHost() {
		anfitriao.adicionaDog("Julie", "André", 100);
		anfitriao.adicionaDog("Toto", "Maty", 100);
		assertEquals(anfitriao.consultaValorHospedagem(dog, 3), 120);
		assertEquals(anfitriao.consultaValorHospedagem(dog, 0), 0);
		// assertNotEquals(anfitriao.consultaValorHospedagem(dog2, 3), 120);
		
		assertEquals(anfitriao.adicionaDog("Nina", "Arthur", 2), true);
		assertEquals(anfitriao.adicionaDog("Tutu", "Joaquim", 2), false);
	}

}
