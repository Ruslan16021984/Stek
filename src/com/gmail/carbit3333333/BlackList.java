package com.gmail.carbit3333333;

public class BlackList {
	private Class[] blackListArray = new Class[0];

	public BlackList() {
		super();
	}
	public void addBlackList (Class cls) {
		if(checkBlackList(cls)) {
			return;
		}
		Class[] temp = new Class[blackListArray.length +1];
		System.arraycopy(blackListArray, 0, temp, 0, blackListArray.length);
		temp[temp.length-1]= cls;
		blackListArray = temp;
		
	}
	public boolean checkBlackList(Class csl) {
		for(Class clsOne : blackListArray) {
			if(clsOne.equals(csl)) {
				return true;
				
			}
		}
		return false;
	}
	public boolean checkObject(Object object) {
		for(Class i: blackListArray) {
			if(i.equals(object.getClass())) {
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Class class1 : blackListArray) {
			builder.append(class1).append(System.lineSeparator());
		}
		return builder.toString();
	}
	
	

}
