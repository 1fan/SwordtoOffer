package Power11;

/**        
 * Title: ��ֵ�������η�     
 * Description: ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η��� 
 * @author rico       
 * @created 2017��6��5�� ����4:49:19    
 */      
public class Solution {
	  
	/**     
	 * @description 
	 * @author rico       
	 * @created 2017��6��5�� ����6:10:58     
	 * @param base
	 * @param exponent
	 * @return     
	 */
	public double Power(double base, int exponent) {
		if (base == 0) {  // �߽����
			return 0;
		}else if (exponent == 0) {    // �߽����
			return 1;
		}
		
		double result = base;
		int e = Math.abs(exponent);  // e�ľ���ֵ
		for (int i = 0; i < e-1; i++) {
			result *= base;
		}
		
		// ����exponent�������ԣ������Ƿ�ȡ����
		return exponent > 0 ? result : (1/result);  
	}
}