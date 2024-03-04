package sec1;

public class GenericExam {

	public static void main(String[] args) {
		Generic1<Student> s = new Generic1<Student>();
		Student a = new Student("장원영",21);
		s.setField1(a);
		Generic1<Teacher> t = new Generic1<Teacher>();
		Teacher b = new Teacher("김기태",43);
		t.setField1(b);
		//Generic1<int> i = new Generic1<int>(); 기본형은 안된다.
		Generic1<Integer> i = new Generic1<Integer>();
		i.setField1(1004);
		Generic1<String> str = new Generic1<String>();
		str.setField1("김기태");

	}

}
