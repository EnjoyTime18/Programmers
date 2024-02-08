class Solution {
    public int solution(int price) {

		int result = 0;

		if (price >= 100000 && price < 300000) { // 100000 ~ 299999
			result = (int) (price * 0.95); // () 우선순위는 먼저 price 계산 수행 후 int형으로 명시적 형변환 진행
		} else if (price >= 300000 && price < 500000) { // 300000 ~ 499999
			result = (int) (price * 0.90);
		} else if (price >= 500000 && price <= 1000000) {
			result = (int) (price * 0.80);
		} else {
			// else문 무조건 필수!!! (없는 경우 채점 실패!)
			// 위의 다중 if문들은 일정 조건 금액이 성립하여 할인을 받을 경우에만 동작하는 조건들이지만 
			// 만약 할인을 받지 못하는 경우까지 생각해야 하기 때문에 이러한 상황까지 대비해야 할 필요성이 있기에 else문을 작성한다.
			// 10 ~ 99999
            result = price;
        }

		return result;
	}
}