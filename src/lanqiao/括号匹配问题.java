package lanqiao;

public class ����ƥ������ {
	int n;
	char[] s;
	int[][] dp;

	void run() {
//	  https://blog.csdn.net/my_sunshine26/article/details/77141398
		for (int len = 2; len <= n; len++) {
			for (int i = 1; i <= n; i++) {
				int j = i + len - 1;
				if (s[i] == '(' && s[j] == ')' || s[i] == '[' && s[j] == ']') {
					dp[i][j] = dp[i + 1][j - 1] + 2;
//[iiiijjjj]  ��������
				}
				for (int k = i; k < j; k++) {
					dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j]);
				}

			}

		}
	}
}
