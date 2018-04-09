package algorithm.jingdong;

public class Balls {
	 public int calcDistance(int A, int B, int C, int D) {
	      int a=getDis(100);
	      int b=getDis(B);
	      int c=getDis(C);
	      int d=getDis(D);
	      return a+b+c+d;
	    }

	private int getDis(int a) {
		int count=a;
		
		while(a/2!=0){
			a=a/2;
			count=count+2*a;
			
			System.out.println(a);
		}
		return count;
	}
	public static void main(String[] args) {
		Balls balls=new Balls();
		balls.getDis(100);
	}
}
