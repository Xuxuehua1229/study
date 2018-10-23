package algorithm;

/**
 * 1 
 * 11 
 * 121 
 * 1331 
 * 14641 
 * ......
 * 
 * @author BrainLiu
 * 
 */
public class YangHuiTriangle {
    public static int[][] YHTriangle(int count){
    	int[][] triangle = new int[count][];
    	//�ȳ�ʼ����ά����
    	for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i+1];
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][0] = triangle[i][i] = 1;//��ÿһ�еĵ�һ�к����һ�и�ֵΪ"1"
				if(i>1 && j>0 && j<i){//�ų�ÿһ�еĵ�һ�������һ��
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
				}
			}
		}
    	return triangle;
    }
	public static void main(String[] args) {
		int[][] triangle = YHTriangle(6);
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
