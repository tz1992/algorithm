package algorithm.disjointset;

/*
 * 用于解决的问题：一般用于集合，判断一个元素是否属于某个集合，或者判断两个元素是否属于同一集合
 * 也会 用于kruskal最小生成树算法
 * 
 * 这是最基本的并查集算法，缺点是合并的速度太慢，合并一次就需要O(n)
 */
public class Sample {
	int arr[];
	int size;

	// 并查集的初始化
	public Sample(int n) {
		arr = new int[n + 1];
		size = n;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	// 判断属于哪个集合
	public int find(int n) {
		return arr[n];
	}

	// 合并集合,将root1的合并到root2的集合中去
	public void union(int root1, int root2) {
		// 先判断这两个数是否是同一个集合
		if (find(root1) != find(root2)) {
			for(int i=0;i<=this.size;i++){
				//如果和root1属于同一个集合，就全部合并到root2中
				if(find(i)==find(root1)){
					arr[i]=find(root2);
				}
			}
				
			
		} else {
			System.out.println("这两个数是属于同一个集合");
		}

	}

	public static void main(String[] args) {
		Sample sample = new Sample(5);
		sample.union(1, 2);
		sample.union(2, 3);
		sample.union(3, 4);
	sample.union(4, 5);
		int[] arr = sample.arr;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
