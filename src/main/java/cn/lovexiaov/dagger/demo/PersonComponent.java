package cn.lovexiaov.dagger.demo;

import dagger.Component;

@Component(modules = { PersonMoudle.class })
public interface PersonComponent {
	Person inject();
}
