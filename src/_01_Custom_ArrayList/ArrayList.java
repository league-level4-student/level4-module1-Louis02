package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] member;

	public ArrayList() {
		member = (T[]) new Object[0];
	}

	public void add(T val) {
		T[] addArray = (T[]) new Object[member.length + 1];
		addArray[addArray.length - 1] = val;
		for (int i = 0; i < member.length; i++) {
			addArray[i] = member[i];
		}
		member = addArray;
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return member[loc];
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[]inArray = (T[]) new Object[member.length+1];
		for(int i = 0; i<inArray.length;i++) {
			if(i<loc) {
				inArray[i] = member[i];
			}
			else if (i>loc) {
				inArray[i] = member[i-1];
			}
			else {
				inArray[i] = val;
			}
			
		}
		member=inArray;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		member[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[]remArray = (T[]) new Object[member.length-1];
		for(int i = 0; i<member.length;i++) {
			if(i<loc) {
				remArray[i]=member[i];
			}
			else if(i>loc) {
				remArray[i-1]= member[i];
			}
			else {
				continue;
			}
		}
		member=remArray;
	}

	public boolean contains(T val) {
		boolean ans  = false;
		
		for(int i = 0; i<member.length;i++) {
			if(member[i].equals(val)) {
			System.out.println("here");
				ans = true;
				break;
			}
			
		}
		return ans;
	}

	public int size() {
		// TODO Auto-generated method stub
		return member.length;
	}
}