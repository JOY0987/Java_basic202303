package day13.compared;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                new Student("홍철수", 15, 79),
                new Student("박박박", 17, 41),
                new Student("손손손", 11, 11),
                new Student("감감감", 25, 34)
                )
        );
        // 불변성: ArrayList로 감싸지 않고 그냥 List.of로 생성한 리스트 객체는 추가, 삭제 불가능

        // 나이 순으로 오름차 정렬 (나이 적은순)
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 이름 가나다순으로 오름차정렬
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        studentList.forEach(s -> System.out.println(s));
    }
}
