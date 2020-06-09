/**
 * Designed By : Varun
 * Class Name : read Text From Jpeg/Jpg/Img File Util
 * Usage : Read text from Jped/Jpg/Img file
 */

package com.evonsys.citi.util.files;
import java.io.File;

import net.sourceforge.tess4j.ITessAPI.TessBaseAPI;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class readTextFromJpegJpgImgFileUtil {

	public static String readTextFromJpegJpgImgFile(String filePath) throws TesseractException{
		File imgFile = new File(filePath);
		ITesseract instance = new Tesseract();
		instance.setDatapath("./src/main/java/com/evonsys/citi/util/convertFileFormat");
		String result = instance.doOCR(imgFile);
		return result;
		
	}
	public static void main(String[] args) throws TesseractException {
		String txt = readTextFromJpegJpgImgFile("./readingTextFromImageFiles/gif.gif");
		///String jpgFileRead = readTextFromImageFile("C:\\Users\\varun.kandukuri\\Desktop\\jpgFile.jpg");
		System.out.println(txt);
	}
}
