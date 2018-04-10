package algorithm.disjointset;
/*
 * 快合并，慢查找
 */
public class QuickUnion {
int arr[];
int size;
//初始化集合
public QuickUnion(int n){
	arr=new int[n+1];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i;
	}
} 

//找出所属集合，慢查找

public int find(int n){
	int k=n;
	while(k!=arr[k]){
		k= arr[k];
	}
		return k;
	
}

//合并元素，快合并
public void union(int root1,int root2){
	if(find(root1)!=find(root2)){
		arr[find(root1)]=find(root2);
	}
}

}
