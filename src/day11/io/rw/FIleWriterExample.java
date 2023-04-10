package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterExample {

    public static void main(String[] args) {

        // 파일 내보내기
        try (FileWriter fw = new FileWriter("D:/exercise/메롱.txt")) {
            String s = "메롱메롱메롱\n약오르쥥";
            fw.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
