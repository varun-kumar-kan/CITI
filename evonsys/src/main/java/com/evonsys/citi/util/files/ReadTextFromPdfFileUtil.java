/**
 * Designed By : Varun
 * Class Name : Read Text From Pdf File Util
 * Usage : Read Text from Pdf file
 */
package com.evonsys.citi.util.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadTextFromPdfFileUtil {
	public static void readTextFromPdfFile(String pdfFile) throws IOException{
		/*File file = new File(pdfFile);
		FileInputStream fi = new FileInputStream(file);
		PDFParser parser = new PDFParser((RandomAccessRead) fi);
		parser.parse();
		COSDocument cosDoc = parser.getDocument();
		PDDocument pdDoc = new PDDocument(cosDoc);
		PDFTextStripper strip = new PDFTextStripper();
		String data = strip.getText(pdDoc);
		System.out.println(data);
		//return data;
*/	
		
		FileInputStream fi = new FileInputStream(pdfFile);
		PDDocument objDoc = PDDocument.load(fi);
		PDFTextStripper objPDFStrp = new PDFTextStripper();
		String pdfContent = objPDFStrp.getText(objDoc);
		System.out.println(pdfContent);
	}
	public static void main(String[] args) throws IOException {
		readTextFromPdfFile("./readingTextFromImageFiles/12.pdf");
		
	}
}
