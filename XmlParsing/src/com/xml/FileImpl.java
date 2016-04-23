package com.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileImpl {

	public static void main(String[] args) {

		File fXmlFile = new File("C:/Learning/Xml/books.xml");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(fXmlFile);
			if(fXmlFile.canRead()){
				System.out.println("File is accessible...");
			}
			StringBuffer sb = new StringBuffer();
			int availableBytes = fileInputStream.available();
			do {
				byte b[] = null;
				if(availableBytes > 0){
					b = new byte[1024];
				}else{
					b = new byte[availableBytes];
				}
				System.out.println(fileInputStream.read(b));
				sb.append(new String(b));
				availableBytes = fileInputStream.available();
			}while(availableBytes > 0);
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fXmlFile != null){
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
	}

}
