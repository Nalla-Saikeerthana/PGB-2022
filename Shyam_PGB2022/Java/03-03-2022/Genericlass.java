public class Genericlass<X> {
	private X y;
	public void add(X y)
	{
		this.y = y;
	}
	public X get() { 
		return y; }

	public void getArea() {}

	public static void main(String[] args)
	{
		Genericlass<Integer> factorial = new Genericlass<Integer>();
		Genericlass<Double> area = new Genericlass<Double>();
		factorial.add(10);
		area.add(2.5);
		System.out.println(factorial.get());
		System.out.println(area.get());
	}
}

