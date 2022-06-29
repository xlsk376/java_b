package B1_변수_알고리즘;

public class 변수_알고리즘_봉사활동_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
		 * 철수 반학생은 16명이다.
		 * 8명은 양로원에 봉사활동을 다녀왔고
		 * 4명은 지하철 봉사활동을 다녀왔다. 
		 * 봉사활동을 다녀오지않은 학생의 비율은 몇%인가  
		 */
		
		double t = 16;
		double y = 8;
		double s = 4;
		
		System.out.printf("%.0f", (t - y - s)/t *100 );
		System.out.print("%");
     }
}