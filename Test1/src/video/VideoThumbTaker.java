package video;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 这种方式需要下载ffmpeg工具  ffmpeg.exe
 *  ffmpegApp:工具地址  比如：D:/ffmpeg-20170811-5859b5b-win64-static/bin/ffmpeg.exe
 */
public class VideoThumbTaker {
   protected String ffmpegApp;
   public VideoThumbTaker(String ffmpegApp){
	   this.ffmpegApp = ffmpegApp;
   }
   
   
   public void getThumb(String videoFileName,String thumbName,int width,
		   int height,int hour,int min,float sec) throws IOException, InterruptedException {
	   ProcessBuilder pb = new ProcessBuilder(ffmpegApp,"-y","-i",videoFileName,"-vframes",
			   "1","-ss",hour+":"+min+":"+sec,"-f","mjpeg","-s",width+"*"+height,"-an",thumbName);
       Process process = pb.start();
       
       InputStream is = process.getInputStream();
       InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       String line;
       while ((line = br.readLine()) != null) {
		  process.waitFor();
	   }
       if(br != null){
    	   br.close();
       }
       if(isr != null){
    	   isr.close();
       }
       if(is != null){
    	   is.close();
       }
   }
   
   public static void main(String[] args) {
	  VideoThumbTaker vtt = new VideoThumbTaker("D:\\javaLearnVideo\\52090d9ed605d9f58a021ce7696faed4.mp4");
	  try {
		vtt.getThumb("D:\\javaLearnVideo\\52090d9ed605d9f58a021ce7696faed4.mp4", 
				  "c:\\thumbTest.png", 800, 600, 0, 0, 9);
		System.out.println("over");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
