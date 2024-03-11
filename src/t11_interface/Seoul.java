package t11_interface;

public class Seoul implements Test1{
	int max;

	@Override
	public void data() {  
		System.out.println("이곳은 Seoul class의 data method");
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Seoul class의 data2 method");
	}

	@Override
	public void data1(int su) {
		if(su > MAX) max = su;
		else max = MAX;
		System.out.println("최대값 : " + max);
	}
}
