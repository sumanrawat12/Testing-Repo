package AbstractionPractice;

public class DogMaltes {
public static void main(String args[]) {
	Dog dogvar = new Dog();
	dogvar.breed = "Maltes ";
	dogvar.color = "red ";
	dogvar.age = 4;
	dogvar.size= " big";
	
	System.out.println("printing all aboe"+dogvar.getInfo());
	
}
}
