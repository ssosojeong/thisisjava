package sec05.exam04_comparator;

import java.util.*;

public class DescendingComparator implements Comparator<Fruit>{


	@Override
	public int compare(Fruit o1, Fruit o2) {
		//내림차순 정렬
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		else return -1;
	}

}
