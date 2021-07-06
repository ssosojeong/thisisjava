package verify.exam13;

import java.text.*;
import java.util.*;

public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		
		System.out.println(format.format(now));

	}

}
