package test.org.yelong.codec.binary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.yelong.codec.binary.Base64Utils;

public class Base64UtilsTest {

	@Test
	public void fileToBase64String() throws IOException {
		File file = FileUtils.getFile("C:\\javatest\\file\\images\\6bcebc87cdcfed33b994fe4c41e36240ecf13df4.jpg");
		String base64 = Base64Utils.toBase64String(file);
		System.out.println(base64);
	}

	@Test
	public void toBase64String() throws IOException {
		String base64 = Base64Utils.toBase64String("abc");
		System.out.println(base64);
	}
	
	@Test
	public void decodeBase64String() throws IOException {
		String str = Base64Utils.decodeBase64String("YWJj");
		System.out.println(str);
	}

}
