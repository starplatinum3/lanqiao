package lanqiao;

public class ��������������� {
//	���ӣ�https://www.nowcoder.com/questionTerminal/459bd355da1549fa8a49e350bf3df484
//		��Դ��ţ����

		 public int FindGreatestSumOfSubArray(int[] array) {
		         if (array.length==0 || array==null) {
		             return 0;
		         }
		         int curSum=0;
		         int greatestSum=0x80000000;
		         for (int i = 0; i < array.length; i++) {
		             if (curSum<=0) {
		                 curSum=array[i]; //��¼��ǰ���ֵ
		             }else {
		                 curSum+=array[i]; //��array[i]Ϊ����ʱ������֮ǰ�����ֵ���������ֵ��
		             }
		             if (curSum>greatestSum) {
		                 greatestSum=curSum; 
		             }
		         }
		         return greatestSum;
		     }
		 
		 int  findG(int[] array) {
			 int curSum=0;
			 int greatestSum=0x80000000;
			 for (int i = 0; i < array.length; i++) {
				if(curSum<=0) {
					curSum=array[i];
				}else {
					curSum+=array[i];
				}
				if(curSum>greatestSum) {
					greatestSum=curSum;
				}
			}
			 return greatestSum;
		 }
}
