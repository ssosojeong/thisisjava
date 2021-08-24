package sec02.stream_kind;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/Users/kimsojeong/dev/git/thisisjava");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
		
	}

}
