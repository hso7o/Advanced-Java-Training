package functional.interfaces;

import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

public class FuncIntDemo {

	public FuncIntDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,Integer,Integer> func = (a,b)-> a +b;
		System.out.println(func.apply(6,9));
		ToIntBiFunction<Integer,Integer> tifunc = (a,b)->a + b;
		System.out.println(tifunc.applyAsInt(6,9));

	}

}
