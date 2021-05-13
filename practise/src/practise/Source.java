package practise;
import java.util.*;
import java.util.ArrayList;
class ArrayListOps {
	public static ArrayList makeArrayListInt(int n){
       
       ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(n, 0));
       for(int i = 0; i < list.size(); i++) {
    	   list.add(i,0);
       }
	return list;
	}
	public static ArrayList reverseList(ArrayList<Integer> l){
        int n = l.size();
		int i = 0;
		int r = n-1;
		while(i <= r){
			Integer a = l.get(i);
			l.set(i, l.get(r));
			 l.set(r, a);
			i++;
			r--;
		}
		return l;
	}
	public static ArrayList changeList(ArrayList<Integer> l, int m, int n){
		for(int i  = 0; i < l.size()-1; i++){

           if(l.get(i) == m){
			   l.set(i, n);

		   }
		}
		return l;
	}
    

}
public class Source extends ArrayListOps{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		int n = 4;
		int m = 28;
		int n1 = 20;
		ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		
		ArrayList<Integer> list1 =  makeArrayListInt(n);
		System.out.println(list1);
		ArrayList<Integer> list2 = reverseList(temp);
		System.out.println(list2);
		ArrayList<Integer>list3 = changeList(list2,m,n1);


System.out.println(list3);
}
	
	
}