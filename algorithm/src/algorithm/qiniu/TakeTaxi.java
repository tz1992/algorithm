package algorithm.qiniu;

import java.util.Arrays;
import java.util.Scanner;

/*问题描述：
 * 
 * 妞妞参加完Google Girl Hackathon之后,打车回到了牛家庄。
妞妞需要支付给出租车司机车费s元。妞妞身上一共有n个硬币，第i个硬币价值为p[i]元。
妞妞想选择尽量多的硬币，使其总价值足以支付s元车费(即大于等于s)。

但是如果从妞妞支付的这些硬币中移除一个或者多个硬币，剩下的硬币总价值还是足以支付车费的话，出租车司机是不会接受的。
例如: 妞妞使用价值为2，5，7的硬币去支付s=11的车费,出租车司机是不会接受的，因为价值为2这个硬币是可以移除的。

妞妞希望能选取最大数量的硬币，使其总价值足以支付车费并且出租车司机能接受。
妞妞希望你能帮她计算最多可以支付多少个硬币。

 */
public class TakeTaxi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int price = in.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int total = 0;
		int count = 0;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
			if (total == price) {

				break;
			} else if (total > price) {
				k = i;
				break;
			}
		}

		for (int i = num; i >= 0; i--) {
			if (total - arr[i] >= price) {
                total=total-arr[i];
                count++;
			}
		}
		
		System.out.println(k+1-count);

	}
}
