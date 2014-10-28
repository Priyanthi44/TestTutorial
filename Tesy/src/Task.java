import java.util.ArrayList;
import java.util.List;

public class Task {

	public static void main(String[] arg) {
		
	
//				List<Integer> a = getPerfectNumbers(0, 10000);
//		for(int i =0; i<a.size(); i++) {
		System.out
				.println(1000000000*getProbability(7, 7))
				;
//	}
	}
public static int getSumNum(String s){
	String words[]= s.split("{' ''/n''/t''/r'}");
	int sum=0;
	
	for (String st: words){
		if(Character.isDigit(st.charAt(0))){
			sum+= Integer.parseInt(st.trim());
		}
		
	}
	return sum;
	
}
	public static int getSumOfNumbers(String s) {
		int sum = 0;
		int beg = 0;
		int end = 0;
		char f = 0;
		// loop through the string
		for (int i = 0; i < s.length(); i++) {
			// get current string

			char c = s.charAt(i);

			// start of the string
			// first space met
			// found a character in the string

			if (Character.isDigit(c)) {
				if (i > 0) {

					f = s.charAt(i - 1);

				}
				if (Character.isLetter(f)) {
					continue;
				}

				if (beg == end) {
					beg = i; // start index
					end = beg + 1;
				} else {
					end = i;// end index
				}

				// continue until numbers cannot be found
				if (s.length() - 1 == i) {
					sum += addString(beg, i + 1, s);
				}

				continue;

			} else {

				if (!Character.isSpaceChar(c))
					beg = end;
			}
			if ((beg != end)) {

				// extract numbers
				sum += addString(beg, i, s);
				beg = end;
			}
		}

		return sum;
		/*
		 * Please implement this method to return the sum of all integers found
		 * in the parameter String. You can assume that integers are separated
		 * from other parts with one or more spaces (' ' symbol). For example,
		 * s="12 some text 3  7", result: 22 (12+3+7=22)
		 */
	}

	private static int addString(int beg, int end, String s) {
		int sum = 0;
		String str = s.substring(beg, end);
		str.trim();
		if (Character.isDigit(str.charAt(0)))
			sum += Integer.parseInt(str);
		return sum;

	}
    public static Object[] reverseArray(Object[] a) {
    	Object[] ob = null;
    	ob= new Object[a.length];
    	int j=0;
    	for (int i=a.length-1; i>=0; i--){
    	
    	ob[j]=a[i]	;
    	j++;
    	}
		return ob;
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
    }
    public static List<Integer> getPerfectNumbers(int from, int to) {
    	List<Integer> l = null;
    	l =new ArrayList<Integer>();
    	;
    	for(int i =from; i<to;i++){
    		int sum = 0;
    		for(int j=1; j<i;j++){
    			
    		if(i%j==0){
    			sum+= j;
    		}
    		}
    		if(sum ==i){
    			l.add(i);
    			
    		}
    	}
		return l;
    	
        /*
          Please implement this method to
          return a list of all perect numbers in the given range inclusively.
          A perfect number is defined as a positive integer which is the sum of its positive divisors not including the number itself.
          For example: 6 is a perfect number because 6 = 1 + 2 + 3 (1, 2, 3 are divisors of 6)
          28 is also a perfect number: 28 = 1 + 2 + 4 + 7 + 14
         */
    }
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static int getLargestRootToLeafSum(Node root) {
		return 0;
        /*
          A root-to-leaf path in a tree is a path from a leaf node through all its ancestors
          to the root node inclusively.
          A "root-to-leaf sum" is a sum of the node values in a root-to-leaf path.

          Please implement this method to
          return the largest root-to-leaf sum in the tree.
         */
    }
    public static List<String> transferFromAtoC(int n) {
    	List<String> l =new ArrayList<String>();
    	int a=1; //holds  current active disk on the peg A
    	int b=0;//ditto
    	int c =0; //ditto
    	for(int i=0; i<n;i++ ){
    		//i denotes the size of the disk
    		 // disk on A
//    		if()
    		if(!(a > b)){
    			l.add("AB");
    			b =a;
    			a=b+1;
    			continue;
    		}
    		
    	}
		return l;
        /*
          Towers Of Hanoi.
          There are three pegs: A, B and C. There are n disks. All disks are different in size.
          The disks are initially stacked on peg A so that they increase in size from the top to the bottom.
          The goal is to transfer the entire tower from the A peg to the C peg.
          One disk at a time can be moved from the top of a stack either to an empty peg or to
          a peg with a larger disk than itself on the top of its stack.

          The method should return a sequence of disk moves, each move is a String with two letters (A, B or C)
          corresponding to the peg the disk moves from and the peg it moves to.
          For example, the move "AC" means that a top disk from peg A should be moved to peg C.
         */
    }
    public static double getProbability(int Y, int X) {
    double sum=0;
    	if(X<=Y){
    	for (int j=X//number of fours
    			; j<=Y//number of dices
    			; j++){
    		
    	double a1=(double)j;//number of fours x(required) to y(maximum)
    	double a2= (double)(Y-j);//number of not fours
    	double p1 =1.0/99.0;//probability of getting a four   
    	double p2 =98.0/99.0;//probability of not getting a four
		 sum +=Math.pow(p1,a1 )*Math.pow(p2, a2)
				 ;
    	}
        /*}
          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
          
         */
    	}
    	return sum;
    		}
    public static boolean isPalindrome(String s) {
    	boolean c = true;
    	int j =s.length()-1;
    	for(int i =0; i<s.length(); i++){
    		if(s.charAt(i)!=s.charAt(j)){
    			c=false;
    			break;
    		}
    	j-=1;
    	}
		return c;
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
    }
}
