import java.io.*;

public class Main{
	public static void main(String... args){
		//Question 1
		
		String path = "/home/rushil/CDACPune_2024/Java/lab15/FileHandlingPractice";
		
		File folder = new File(path);

		if(folder.isDirectory()) for(String files : folder.list()) System.out.println(files);
		else if(folder.isFile()) System.out.println("It is a file");
		else System.out.println("The fuck is happening?");

		//Question 2

		String filePath = "/home/rushil/CDACPune_2024/Java/lab15/FileHandlingPractice/doesFileExist.txt";
		
		File doesFileExist = new File(filePath);
		if(!doesFileExist.exists()){
			try{
				doesFileExist.createNewFile();
			}catch(IOException e){
				System.out.println("The error message is :" + e.getMessage());
			}
		}else System.out.println("File already exist -->q2");

		//Question 3

		try{
			FileReader fileRead = new FileReader(filePath);
			int c;
			while((c=fileRead.read())!=-1){
				System.out.print((char)c);
			}
			System.out.println();
		}catch(IOException e){
			System.out.println("The error message is :" + e.getMessage());
		}

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
			String str;
			while((str = bufferedReader.readLine())!=null){
				System.out.println(str);
			}
			bufferedReader.close();
		}catch(IOException e){
			System.out.println("The error message is:" + e.getMessage());
		}

		//Question 4
		//Using FileReader and FileWriter
			String newPath = path+"/q4.txt";
			File newFile = new File(newPath);
			if(!newFile.exists()){
                try {
                    newFile.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("New file created --> q4");
			}else System.out.println("File already exist --> q4");
            try (FileReader fileReader = new FileReader(filePath)) {

                int c;
                try (FileWriter fileWriter = new FileWriter(newFile)) {
                    while ((c = fileReader.read()) != -1) {
                        //System.out.print((char) c);
                        fileWriter.write(c);
                    }
                }catch(IOException e){
					System.out.println("The error on line 73:" + e.getMessage());
				}
            }catch(IOException e) {
				System.out.println("The error on line 76:" + e.getMessage());
			}

			//Using BufferedReader and BufferedWriter

			//Creating new file;
			String bufferedPath = path+"/q4_Buffered.txt";
			File file = new File(bufferedPath);
			if(!file.exists()){
				try {
					file.createNewFile();
					System.out.println("New file created");
				}catch(IOException e){
					System.out.println("The error message is :" + e.getMessage());
				}
			}else System.out.println("The file exist already");

			//Reading and writing on that new File

			try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
				BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedPath))
			){
					String str;
					while((str=reader.readLine())!=null){
							writer.write(str);
					}
			}catch(IOException e){
				System.out.println("The error message at line 104" + e.getMessage());
			}

			//Using PrintWriter
			String printPath = path+"/q4_PrintPath.txt";
			File printFile = new File(printPath);
			if(!printFile.exists()) {
				try {
					printFile.createNewFile();
					System.out.println("File created");
				}catch(IOException e){
					System.out.println("The error message at line 112" + e.getMessage());
				}
			}else System.out.println("File already exist");

			try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
				PrintWriter writer = new PrintWriter(printPath)
			){
				String str;
				while((str=reader.readLine())!=null){
					writer.println(str);
				}

			}catch(IOException e){
				System.out.println("The error message at line 104" + e.getMessage());
			}
	}
}
