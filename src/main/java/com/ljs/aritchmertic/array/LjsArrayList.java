package com.ljs.aritchmertic.array;

public class LjsArrayList<E> {

	private int  capacity;
	
	private int threhold;
	
	private final int  defaultCapacity = 16;
	
	private Object[] arry = null;

	public LjsArrayList(int capacity) {
		super();
		arry = new Object[capacity];
	}

	public LjsArrayList() {
		super();
		capacity = defaultCapacity;
	}
	
	public void add(E element) {
		
	}
	
}
