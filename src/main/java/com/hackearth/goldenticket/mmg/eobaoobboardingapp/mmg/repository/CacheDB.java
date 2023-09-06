package com.hackearth.goldenticket.mmg.eobaoobboardingapp.mmg.repository;

import java.util.HashMap;

public class CacheDB {
	
	static private HashMap map = new HashMap();
	
	public void save(String key, String value) {
		map.put(key, value);
	}
	
	public Object get(String key) {
		return map.get(key);
	}
}
