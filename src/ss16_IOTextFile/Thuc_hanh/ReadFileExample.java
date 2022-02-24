package ss16_IOTextFile.Thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//                sum += Integer.parseInt(line);

                String[] nums= line.split(",");
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i]);

                }
                for (int i = 0; i < nums.length; i++) {
                    sum= sum+ Integer.parseInt(nums[i]);
                }
            }
            bufferedReader.close();
            System.out.println("Sum= " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String path= "module2/A1021i1_LeThanhThai/src/ss16_IOTextFile/Thuc_hanh/fileText.csv";
        try {
            File file = new File(path);
            if(!file.exists())
                file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("1,2,5,6,8");
            bufferedWriter.close();
            fileWriter.close();

            readFileText(path);

        }catch (Exception e) {}
    }


//        System.out.println("Enter file path: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//        ReadFileExample readFile = new ReadFileExample();
//        readFile.readFileText(path);
}

