package cn.lovexiaov.dagger.demo;

import javax.inject.Inject;

public class Dog {

	@Inject
	public Dog() {
	}

	public void wauff() {
		System.out.println("wauff");
	}
}
