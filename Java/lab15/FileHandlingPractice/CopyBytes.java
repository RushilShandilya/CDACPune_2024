import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes{
	public static void main(String... args) throws IOException{
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;

		try{
			fileInput = new FileInputStream("FileHandlingPractice/practice.txt");
			fileOutput = new FileOutputStream("outputFile.txt");
			int c;
			while((c = fileInput.read())!=-1){
				System.out.println(c +" " + (char)c);
				fileOutput.write(c);
			}

		}finally{
			if(fileInput!=null)fileInput.close();
			if(fileOutput!=null)fileOutput.close();
		}
		return ;
	}
}