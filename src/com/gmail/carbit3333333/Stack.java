package com.gmail.carbit3333333;

public class Stack {
	private Object[] stek = new Object[0];

	public Stack() {
		super();
	}

	public void addStek(Object object, BlackList blackList) {
		if (!blackList.checkObject(object)) {
			Object[] temp = new Object[stek.length + 1];
			System.arraycopy(stek, 0, temp, 0, stek.length);
			temp[temp.length - 1] = object;
			stek = temp;
		} else {
			System.out.println("Object " + object.toString()
					+ " обьект находится в черном списке и неможет быть добавленг в Stek ");
		}
	}

	public void getRemoveStek(Object object) {
		int n = 0;
		for (int i = 0; i < stek.length; i++) {
			if (stek[i] == object) {
				n++;
				System.out.println("Object " + stek[i] + " был найден на  " + (i + 1) + " позиции и успешно удален!");
				Object[] tempOne = new Object[stek.length - 1];
				System.arraycopy(stek, 0, tempOne, 0, i);
				for (int z = i; z < tempOne.length; z++) {
					tempOne[z] = stek[z + 1];
				}
				stek = tempOne;
			}
		}
		if (n == 0) {
			System.out.println("ctek пустой!");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Object object : stek) {
			builder.append(object).append(System.lineSeparator());
		}
		
		return builder.toString();
	}
	

}
