package p2;

import java.util.ArrayList;
import java.util.List;

public class MySmartClass<T> {
	List<T> list = new ArrayList<>();

	public void doAddData(T data) {
		list.add(data);

	}

	public T getData(int index) {
		return list.get(index);
	}

}
