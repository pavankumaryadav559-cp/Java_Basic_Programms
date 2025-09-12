package com.abstract_animal;

public class TestRoamsAnimals {
public static void main(String[] args) {
	new Lion().roam();
	new Dog().roam();
	var a=new Lion();
	TestRoamsAnimals.getAnimal(a);
}
public static void getAnimal(Animal a) {
	if(a instanceof Lion) {
		new Lion().roar();
	}
	else if(a instanceof Dog) {
		new Dog().bark();
	}
}
}
