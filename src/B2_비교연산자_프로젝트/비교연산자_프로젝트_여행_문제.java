package B2_비교연산자_프로젝트;

public class 비교연산자_프로젝트_여행_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 고속버스를 타고 여행을 떠나려한다.
		 * 출발시간까지 1시간 여유가 있다.
		 * 고속버스역과 상점을 시속 3km로 걸어서 왕복을 하고,
		 * 10분동안 물건을 산다고 하면
		 * 역에서 1.3km 떨어진 상점을 다녀올수 있나요?
		 */
		
		//double 시속 = 3.0;
		//double 거리 = 1.3;
		
		//System.out.println((거리/(시속/60))*2+10);
		
		
		double 상점거리 = 1.3;
		double 시속 = 3.0;
		double 분속 = 시속/60.0;
		
		double 편도 = 상점거리 /분속;
		double 왕복 = 편도 * 2;
		double 쇼핑시간 = 10;
		System.out.println(왕복 + 쇼핑시간);
		System.out.println(왕복 + 쇼핑시간 <= 60);
		
		System.out.println(상점거리 / 시속 * 60 * 2 + 10); // 시간을 구한뒤 분으로

	}

}
