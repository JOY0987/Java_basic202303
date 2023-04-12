package day11.io.objstream;

import day11.io.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadSnack {
    
     private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {
        for (Snack s :
                snackList) {
            System.out.println(s);
        }
    }

    private static void loadFile() {
        try (FileInputStream fis = new FileInputStream(Path.ROOT_PATH + "/snack.sav")) {

            // 객체를 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> object = (List<Snack>) ois.readObject(); // List 로 세이브했으니 로드할 때도 형변환 필요!
            snackList = object;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
}
