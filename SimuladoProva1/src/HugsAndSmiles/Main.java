package HugsAndSmiles;

public class Main {
	
	public static void main(String[] args) {
		DogHost dogHost = new DogHost("Julia", 2, 6);
		
		
		Dog dog = new Dog("Toto", "Pedro", 5);
		Dog dog2 = new Dog("MAri", "Joao", 20);
		
		System.out.println(dogHost.adicionaDog("Toto", "Pedro", 1));
		System.out.println(dogHost.adicionaDog("nana", "FOdase2", 2));
		System.out.println(dogHost.adicionaDog("nina", "FOdase", 5));
		System.out.println(dogHost.adicionaDog("nina", "FOdase", 5));
		System.out.println(dogHost.listaDogs());
		System.out.println(dog.getNomePet());
		System.out.println(dogHost.consultaValorHospedagem(dog,10));
		System.out.println(dog2.getNomePet());
		System.out.println(dogHost.consultaValorHospedagem(dog2,10));
	}
}
