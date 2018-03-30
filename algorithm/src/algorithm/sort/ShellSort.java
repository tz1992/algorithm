package algorithm.sort;

public class ShellSort {
public static void main(String[] args) {
	int []a={1,9,8,2,5,3,4,7,6,0};
	int gap=a.length;
	while(true){
		gap=gap/2;
		for(int i=0;i<gap;i++){
			for(int j=i+gap;j<a.length;j=j+gap){
				int temp=a[j];
				int k;
				for( k=j-gap;k>=0&&a[k]>temp;k=k-gap){
			      a[k+gap]=a[k];
				}
				a[k+gap]=temp;
			}
		}
		if(gap==1){
			break;
		}
	}
	System.out.println("排序之后");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
