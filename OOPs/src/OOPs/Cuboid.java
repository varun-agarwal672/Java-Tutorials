package OOPs;

import java.util.ArrayList;
import java.util.List;

public class Cuboid {
	
	int length;
	int breadth;
	int height;
	
	Cuboid(int length,int breadth,int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	int volume() {
		return length*breadth*height;
	}
	
	public static void main(String args[]) {
		Cuboid rectangle = new Cuboid(10,20,30);
		System.out.println(rectangle.volume());
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			list.add(2*i);
		}
		
		list.forEach(item -> {
			System.out.println(item/2);
		});
		
	}
}
