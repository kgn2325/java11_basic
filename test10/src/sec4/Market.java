package sec4;

public class Market implements Buy, Sell { // 인터페이스는 다중 상속이 가능하다.

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
}
