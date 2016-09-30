package cn.lovexiaov.dagger.demo;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonMoudle {

	@Provides
	public String provideName() {
		return "Xiao Ming！";
	}

}
