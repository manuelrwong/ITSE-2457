package doglist;

import java.util.ArrayList;

public class DogList {

	public static void main(String[] args) {
		Dog buddy0 = new Dog("Buddy0");
		Dog eddy0 = new Dog("Eddy0");
		Dog star0 = new Dog("Star0");
		Dog cookie0 = new Dog("Smart0");
		
		Dog buddy1 = new Dog("Buddy1");
		Dog eddy1 = new Dog("Eddy1");
		Dog star1 = new Dog("Sta1r");
		Dog cookie1 = new Dog("Smart1");
		
		ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
		Dog[][] dogTable = new Dog[2][4];
		
		//Store dogs into dogArray
		Dog[] dogArray0 = {buddy0, eddy0, star0, cookie0};
		Dog[] dogArray1 = {buddy1, eddy1, star1, cookie1};
		
		//Store dogs into dogArrayLIst
		dogArrayList.add(buddy1);
		dogArrayList.add(eddy1);
		dogArrayList.add(star1);
		dogArrayList.add(cookie1);
		
		System.out.println("Dog array has ...");
		for(int i = 0; i < dogArray0.length; i++){
			System.out.println(dogArray0[i]);
		}
		System.out.println();
		System.out.println("Dog array list has ...");
		for(int i = 0; i < dogArrayList.size(); i++){
			System.out.println(dogArrayList.get(i));
		}
		System.out.println();
		
		//Store two dog arrays into a two-dimensional array
		dogTable[0] = dogArray0;
		dogTable[1] = dogArray1; 
		
		//Display dogs
		System.out.println("Dog table has ...");
		for(int i = 0; i < dogTable.length; i++){
			for(int j = 0; j < dogTable[0].length; j++){
				System.out.println(dogTable[i][j]);
		    }
		}
	}
}
