package video;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
/*https://blog.csdn.net/syz_mumu/article/details/77203247 ��ȡ��Ƶ�ĵ�һ֡��ΪͼƬ
 * ע �� javacv0.8 �ķ�����������������ͬ
BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
bi.getGraphics().drawImage(getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);*/
//IplImage img = frame.image;
/* ע �� javacv0.8 �ķ�����������������ͬ
int owidth = img.width();
int oheight = img.height();*/

/**
 * ʹ��Javacv 
 * ��ȡ��Ƶ�ĵ�һ֡��ΪͼƬ
 * @author 
 *
 */
public class VideoTest {
   public static void fetchFrame(String videlFileName,String frameFile) throws IOException{
	   System.out.println("fetchFrame11111");
	   long start = System.currentTimeMillis();
	   File targetFile = new File(frameFile);
	   FFmpegFrameGrabber ff = new FFmpegFrameGrabber(videlFileName);
	   ff.start();
	   int lenght = ff.getLengthInFrames();
	   int i = 0;
	   Frame frame = null;
	   while (i < lenght) {
		  frame = ff.grabFrame();
		  //����ǰ��֡���������ȫ�ڵ�ͼƬ�����Լ��������
		  if((i > 48) && (frame.image != null)){
			  break;
		  }
		  i++ ;
	   }
	   
	   int owidth = frame.imageWidth;
	   int oheight = frame.imageHeight;
	   
	   //�Խ�ȡ��֡���еȱ�������
	   int width = 360;
	   int height = (int)(((double)width/owidth) * oheight);
	   Java2DFrameConverter converter = new Java2DFrameConverter();
	   BufferedImage fecthedImage = converter.getBufferedImage(frame);
	   BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
	   bi.getGraphics().drawImage(fecthedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 
			   0, 0, null);
	   
	   ImageIO.write(bi, "jpg", targetFile);
	   ff.stop();
	   System.out.println(System.currentTimeMillis() - start);
   }
   
   public static void main(String[] args) {
	  try {
		VideoTest.fetchFrame("D:\\javaLearnVideo\\52090d9ed605d9f58a021ce7696faed4.mp4", "D:\\newTestVideo\\testVideo3.jpg");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
