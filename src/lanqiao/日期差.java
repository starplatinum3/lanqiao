package lanqiao;

public class ���ڲ� {
	class Date {
		int y, m, d;
	}

	int[] mo;

//	int elapse(Date date1,Date date2) {
//	  date1.y--;
//	  
//	  for (int i = 1; i <13&&i<; i++) {
//		
//	}
//  }

	boolean isLeap(int y) {
		return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
	}

	int elapse(Date date) {
		int res = 0;
		date.y--;
		int m = date.m;
		int y = date.y;
//		ÿ 4�� ��ÿ400�궼�������꣬����ÿ��4����ظ���ÿ��400���
//		% ��0 �ģ���+ �����ǵľ���- �������ڱ����룬���������⣩
//		4 100 400 ��� ��������+ - +
		res += y / 4 - y / 100 + y / 400 + y * 365+date.d;
		for (int i = 1; i < 13 && i < m; i++) {
			res += mo[i];
		}
		if (m > 2 && isLeap(date.y + 1)) {
			res++;
		}
		return res;
	}

	int elapse2(Date date) {
//		date.y--;
		int y = date.y - 1;
		int res = y / 4 - y / 100 + y / 400 + y * 365 + date.d;
		for (int i = 1; i <= 12 && i < date.m; i++) {
			res += mo[i];
		}
		if (date.m > 2 && isLeap(date.y))
			res++;
		return res;
	}

}
