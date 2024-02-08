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
            result = price;
        }

		return result;
	}
}