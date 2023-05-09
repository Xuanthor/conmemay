package linkerlits;

import java.util.LinkedList;

public class linked {
	
    int cou (note hear) {
    	note r = hear;
    	int count =1;
    	while(r!=null) {
    		r = r.next;
    		count +=1;
    	}
    	return count;
    }
    public static void main(String[] args) {
    	 linked a = new linked();
    	 note v = new note(1);
    	 note b = new note(5);
    	 note c = new note(7);
    	 System.out.println(a.cou(b));
	}
}
