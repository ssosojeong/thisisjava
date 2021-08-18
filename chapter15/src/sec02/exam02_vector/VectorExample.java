package sec02.exam02_vector;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		for(int i=1; i<6; i++) {
			String subject = "제목" + i;
			String content = "내용" + i;
			String writer = "글쓴이" + i;
			
			list.add(new Board(subject,content,writer));
		}
		
		list.remove(2);
		list.remove(3);
		
		for(Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer + "\t");
		}

	}

}
