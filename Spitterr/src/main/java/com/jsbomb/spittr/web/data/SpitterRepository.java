package com.jsbomb.spittr.web.data;

public interface SpitterRepository {
	Spitter save(Spitter unsaved);

	Spitter findByUserName(String username);
}
