package BasicExams;


public class prog13 {

	public static void main(String[] args) {
		// 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
		// 程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。

		for(int i = 1;i<100000;i++) {	
			
			int a = (int)Math.sqrt(i+100);
			int b = (int)Math.sqrt(i+268);
			if(a*a==(i+100) && b*b==(i+268)) {
				System.out.println(i);
			}			
		}
	}	
}


//public static void main(String[] args) { 
//for (int i = 0; i <10000;i++) { 
//	int num1=(int)Math.sqrt(i+100);//開方，值已固定了
//	int num2=(int)Math.sqrt(i+268);
//	if ((num1*num1==(i+100))&&(num2*num2==(i+268))) {
//		//符合條件的印出
//		System.out.println(i+" ");
//		} 
//	} 
//}