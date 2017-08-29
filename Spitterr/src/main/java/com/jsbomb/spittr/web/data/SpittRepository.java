package com.jsbomb.spittr.web.data;

import java.util.List;

public interface SpittRepository {
	/**
	 * 
	 * @param max - spitt id that represents the maximum id of any Spitt that
	 * should be returned
	 * @param count - indicates how many Spitt objects to return
	 * @return
	 */
	List<Spitt> findSpitts(long max, int count);
	
	Spitt findSpitt(long id);
}
