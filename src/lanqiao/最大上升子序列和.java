package lanqiao;

public class ������������к� {
	int[] num, sum;
	int n;

	void run() {
		for (int i = 0; i < n; i++) {
			sum[i] = num[i];
		}
		 sum[0] = num[0];
		for (int i = 0; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (num[j] < num[i]) {
					sum[i] = Math.max(sum[i], sum[j] + num[i]);
				}
			}
		}
		
		int ma=sum[0];
		for (int i = 1; i <n; i++) {
			if(ma<sum[i]) {
				ma=sum[i];
			}
		}
		
		System.out.println(ma);
	}
}
