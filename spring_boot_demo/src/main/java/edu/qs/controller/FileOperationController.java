package edu.qs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileOperationController {
	@PostMapping("/file")
	public ResponseEntity<String> GetFileData(@RequestParam MultipartFile file){
		
		String name = file.getOriginalFilename();
		long size = file.getSize();
		String type = file.getContentType();
		
		
		String data = "file name"+name +" file size"+size+" Content type "+type;
		
		return new ResponseEntity<String>(data, HttpStatus.OK);
	}

}
