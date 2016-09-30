package cn.lovexiaov.dagger.demo;

public class Main {

	public static void main(String[] args) {
		Person person = DaggerPersonComponent.builder().build().inject();
		person.sayHi();
	}
}
