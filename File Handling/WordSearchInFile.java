import java.io.*;
import java.util.Scanner;

class ProblemsInFiles {
    public static void main(String[] args) {
        System.out.print("Problems in File Handling");
    }
}

// 1. Write a Java program that creates a new file and checks if the file exists.

class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("testfile.txt");

            if (obj.createNewFile()) {
                System.out.println("File Created Successfully: " + obj.getName());
            } else {
                System.out.println("File Already Exists: " + obj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// 2. Write a Java program that writes "Hello, World!" into a text file.


class WriteData {
    public static void main(String[] args) {
        File obj = new File("hello.txt");

        try (
            FileOutputStream fos = new FileOutputStream(obj);
            DataOutputStream dos = new DataOutputStream(fos)
        ) {
            dos.writeUTF("Hello World");
            System.out.println("Message written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

// 3. Write a Java program that reads and displays the content of a given file.

class ReadAndDisplayFile {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Welcome to Java File Handling!");
            writer.newLine();
            writer.write("This is a sample text file.");
            writer.newLine();
            writer.write("Enjoy coding!");
            System.out.println("File created and content written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
            e.printStackTrace();
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading file content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
        }
    }
}

// 4. Write a Java program to append text "Welcome to Java" to an existing file.

class AppendFile {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (
            FileWriter writer = new FileWriter(fileName,true)
            ) {
            writer.write("\n Welcome to Java\n");  
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while appending.");
            e.printStackTrace();
        }
    }
}

// 5. Write a Java program that deletes a file if it exists.

class DeleteAFile{
    public static void main(String[] args) {
        
        try {
            File file=new File("delete_a_file.txt");

            // file.createNewFile();
            // System.out.println("File Created Successfully");

            if(file.exists()){
                file.delete();
                System.out.println("File Deleted successfully");
            }
            else{
                System.out.println("File Not Found");
            }

        } catch (Exception e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}

// 6. Write a Java program that counts the number of lines in a file using BufferedReader.

class CountNoofLines{
    public static void main(String[] args) {

        try{
        File file =new File("data.txt");

        FileReader fr=new FileReader(file);
        BufferedReader bReader=new BufferedReader(fr);
        String line=bReader.readLine();
        int countLines=0;
        while(line!=null){
            line=bReader.readLine();
            countLines++;
        }
        System.out.println("Number of Lines:"+countLines);
        }
        catch(Exception e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}

// 7. Write a Java program to copy the contents of one file to another.

class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destinationFile);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            while ((line=br.readLine())!= null) {
                bw.write(line);
                bw.newLine();  
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error while copying the file.");
            e.printStackTrace();
        }
    }
}

// 8. Write a Java program that takes user input and saves it into a file.

class WriteUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();      

        try (FileWriter writer = new FileWriter("user_input.txt")) {
            writer.write(userInput);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

// 9.Write a Java program that searches for a specific word in a text file.

class WordSearchInFile {
    public static void main(String[] args) {
        String fileName = "data.txt"; 
        String wordToFind = "Java";     

        boolean wordFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToFind)) {
                    System.out.println("Word found in line " + lineNumber);
                    wordFound = true;
                    break; 
                }
                lineNumber++;
            }

            if (!wordFound) {
                System.out.println("Word not found");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}


// 10. Write a Java program to count the number of words in a given text file.

class WordCountInFile {
    public static void main(String[] args) {
        String fileName = "data.txt"; 
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
        
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

