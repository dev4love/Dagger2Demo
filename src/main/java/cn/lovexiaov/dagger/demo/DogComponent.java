package cn.lovexiaov.dagger.demo;

import dagger.Component;

@Component
public interface DogComponent {
	// There is 2 ways to inject:
	// 1. Pass the object to be injected in
	void inject(Person person);

	// 2. Return the injected object
	Dog inject();
}
