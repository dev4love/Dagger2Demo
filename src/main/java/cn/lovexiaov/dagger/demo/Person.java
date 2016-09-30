package cn.lovexiaov.dagger.demo;

import javax.inject.Inject;

public class Person {

	public String name;

	// 1st style inject
	@Inject
	public Dog dog;

	@Inject
	public Person(String name) {
		this.name = name;
		// 1st style inject
		DaggerDogComponent.builder().build().inject(Person.this);
	}

	public void sayHi() {
		System.out.println(String.format("Hi, Everyone, my name is %s.", name));
		// 1st style inject
		dog.wauff();

		// 2nd style inject
		// Dog dog = DaggerDogComponent.builder().build().inject();
		// dog.wauff();
	}
}
