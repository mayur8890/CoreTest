package com.immutable;

public final class ImmutableClass {
	private final Integer immutablefiled1;
	public Integer getImmutablefiled1() {
		return immutablefiled1;
	}

	public String getImmutablefiled2() {
		return immutablefiled2;
	}

	private final String immutablefiled2;
	
	public ImmutableClass(Integer immutablefiled1, String immutablefiled2 )
	{
		this.immutablefiled1=immutablefiled1;
		this.immutablefiled2=immutablefiled2;
	}
	
	

}
