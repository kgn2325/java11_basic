package org.kh.object1;

public class PersonEx1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name="김동연";
		p1.year =1992;
		p1.gender="남성";
		p1.job="취업준비생";
		p1.running();
		System.out.println("안녕하세요 "+p1.year+"생 "+p1.name+"입니다");
	}

}
