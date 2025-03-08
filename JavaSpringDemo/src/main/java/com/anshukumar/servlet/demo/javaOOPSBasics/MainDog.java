package javaOOPSBasics;

public class MainDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d1=new Dog("Poppy","Lebradog");
        Dog d2=new Dog("Jass","kaskd");
        System.out.println(d1.getName()+" "+d1.getBreed());
        System.out.println(d2.getName()+" "+d2.getBreed());
        
        d1.setName("Seroo");
        d1.setBreed("Rotwiller");
        
        d2.setName("Pussh");
        d2.setBreed("local");
        
        System.out.println(d1.getName()+" "+d1.getBreed());
        System.out.println(d2.getName()+" "+d2.getBreed());
	}

}
