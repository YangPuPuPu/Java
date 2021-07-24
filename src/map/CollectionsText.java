package map;
//斗地主
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class CollectionsText {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> array = new ArrayList<>();
		
		String[] colors = new String[] {
			"黑桃","红心","梅花","方块"	
		};
		String[] numbers = new String[] {
			"3","4","5","6","7","8","9","10","J","Q","K","A","2"	
		};
		
		int index = 0;
		for(String number:numbers) {
			for(String color:colors) {
				hm.put(index, color+number);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index++);
		hm.put(index, "大王");
		array.add(index);
		
		Collections.shuffle(array);
		
		TreeSet<Integer> xmSet = new TreeSet<>();
		TreeSet<Integer> zsSet = new TreeSet<>();
		TreeSet<Integer> lsSet = new TreeSet<>();
		TreeSet<Integer> dpSet = new TreeSet<>();
		
		for(index=0;index<array.size();index++) {
			int x = array.get(index);
			if(index>=array.size()-3) {
				dpSet.add(x);
			}else if(index%3==0) {
				xmSet.add(x);
			}
			else if(index%3==1) {
				lsSet.add(x);
			}
			else if(index%3==2) {
				zsSet.add(x);
			}
		}
		lookPoker("小明",xmSet,hm);
		lookPoker("张三",zsSet,hm);
		lookPoker("李四",lsSet,hm);
		lookPoker("底牌",dpSet,hm);
		
	}
	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer, String> hm) {
		System.err.print(name+"的牌是：");
		for(Integer key:ts) {
			String poker = hm.get(key);
			System.out.print(poker+" ");
		}
		System.out.println();
	}
}
