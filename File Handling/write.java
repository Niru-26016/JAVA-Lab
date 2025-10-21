
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class write {

    public static void main(String[] args) {
        String fileName = null;
        String fileContent = "";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the file name:");
            fileName = sc.nextLine();
            System.out.println("Enter the file content:"); // fixed typo
            fileContent = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("The system cannot find the path specified");
        } catch (Exception e) {
            System.out.println(e);
        } finally {

        }
    }
}
