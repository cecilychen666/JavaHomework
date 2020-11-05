
 
import java.util.ArrayList;
import java.util.Arrays;

public class test3 {   

	public static void main(String[] args) {
		
	ArrayList<Number> list = new ArrayList<Number>();

	list.add(15);
	list.add(35);
	list.add(25);
	list.add(45);
	list.add(5);	
	sort(list);

	for(int i=0;i<list.size()-1;i++)
	System.out.print(list.get(i)+" ");
		
	}


	public static void sort(ArrayList<Number>list) {
	
	for(int p = 0;p<list.size()-1;p++){
		Number currentMin=list.get(p);
		int currentMinIndex=p;
		

		for(int q=p+1;q<list.size();q++){
			if(currentMin.doubleValue()>list.get(q).doubleValue()){
			currentMin = list.get(q);
			currentMinIndex = q;
			}
		}
		
		if(currentMinIndex!=p){
		list.set(currentMinIndex, list.get(p));
		list.set(p, currentMin);
			}

		}

	}
}

	
	
