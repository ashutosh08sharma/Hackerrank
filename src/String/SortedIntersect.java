package String;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortedIntersect {
	
	List<Integer> mList = new ArrayList<Integer>();
	List<Integer> fList = new ArrayList<Integer>();
	Set<Integer> resSet = new TreeSet<Integer>();
	for (int i = 0; i < f.length; i++) {
		fList.add(f[i]);
	}
	for (int i = 0; i < m.length; i++) {
		mList.add(m[i]);
	}
	for (Integer fl : fList) {
		if(mList.contains(fl)){
			resSet.add(fl);
			mList.remove(fl);
		}
	}
	resSet=((TreeSet) resSet).descendingSet();
	//Collections.sort(resList);
	int[] res = new int[resSet.size()];
	int j = 0;
	for (Integer r : resSet) {
		res[j] = r;
		j++;
	}
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);
	}


}
}