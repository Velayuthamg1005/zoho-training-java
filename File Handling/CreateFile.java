import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// // Creating File 

class CreateFile{
    public static void main(String[] args) {
        try {
            File obj=new File("Sample.txt");
            if(obj.createNewFile()){
                System.out.println("File Created "+obj.getName());
            }
            else{
                System.out.println("File Already Exists");
            }
        } catch (Exception e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}

// Writing Files

class WriteFile{
    public static void main(String[] args) {
        try {
            FileWriter myFile=new FileWriter("Example.txt");
            myFile.write("It is a Good Practise.");
            myFile.close();
            System.out.println("Written Successfully");
        } catch (IOException e) {
            System.out.println("Error Occured");
        }
    }
}

// Reading File

class ReadFile{
    public static void main(String[] args) {
        try {
            File obj=new File("Example.txt");
            Scanner sc=new Scanner(obj);

            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}

// Delete a File

class DeleteFile{
    public static void main(String[] args) {
        try {
            File obj=new File("sample.txt");
            if(obj.delete()){
                System.out.println("File Deleted "+obj.getName());
            }
        } catch (Exception e) {
            System.out.println("Error Occured");
        }
    }
}

// Make Directory

class MakeDirectory{
    public static void main(String[] args) {
        File makeDir=new File("Vels");
        makeDir.mkdir();
    }
}


