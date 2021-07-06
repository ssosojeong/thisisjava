package sec15.exam01_format;

import java.text.*;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		//0은 무조건 채워지고 반올림됨
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num)); 
		
		//#도 반올림되는데 없으면 비워짐
		df = new DecimalFormat("#");
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num)); 
	
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num)); 
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num)); 
		
		//3자리마다 쉼표 넣기
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));

		//지수 표현
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		//양수 음수 포맷 따로 주기
		df = new DecimalFormat("+#,###; -#.###");
		System.out.println(df.format(num));
		
		//100곱하고 퍼센트 붙이기
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		//통화 기호
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
	}

}
