import java.io.File;
public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File file=new File("C:\\Users\\Admin\\Desktop");// or>>>>
		File file=new File("secret_message.txt");
		
		if(file.exists()) {
			System.out.println("File exixts");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		
		}
		else {
			System.out.println("File does not exist");
		}

	}

}
