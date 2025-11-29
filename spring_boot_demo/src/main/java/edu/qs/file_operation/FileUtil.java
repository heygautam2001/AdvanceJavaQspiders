package edu.qs.file_operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	static String path = "/Users/gautam/Desktop/springBoot/spring_boot_demo/src/main/resources/static/images";
	
	public static boolean fileUploadInFolder(MultipartFile file) {
		byte[]img = null;
		
		try {
			InputStream is = file.getInputStream();
			img = new byte[is.available()];
			is.read(img);
			
			is.close();
			
			FileOutputStream fos = new FileOutputStream(path + File.separator + file.getOriginalFilename());
			fos.write(img);
			fos.flush();
			fos.close();
			
			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
