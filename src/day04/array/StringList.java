package day04.array;

import java.util.Arrays;

// 스트링배열을 제어하는 설계도
public class StringList {
    
    // 필드
    // foodList가 됐든, nameList가 됐든 모든게 sArr로 들어갈 것!
    public String[] sArr;
    
    // 생성자
    // StringList가 생성됐을 때 sArr이 만들어져야함.
    public StringList() {
        sArr = new String[0];
    }
    // 초기값 지정 가능한 생성자
    public StringList(String... initData) {
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }
    // 메서드 (기능)
    // 배열에 저장된 데이터 수를 알려주는 기능
    public int size() {
        return sArr.length;
    }
    // 배열의 맨 끝에 데이터를 추가하는 기능
    public void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp; // 메서드가 끝나면 temp는 알아서 삭제
    }
    // 배열 맨 끝 데이터 삭제하는 기능
    public String pop() {
        String deleteTarget = sArr[sArr.length - 1];
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return deleteTarget;
    }
    // 배열 내부데이터 출력
    public String toString() {
        return Arrays.toString(sArr);
    }
    // 배열이 텅텅 비었는지 확인
    public boolean isEmpty() {
        return sArr.length == 0;
    }
    // 배열 데이터 전체삭제
    public void clear() {
        sArr = new String[0];
    }
    
    // 만들어보기
    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }
    // 중간 삭제 (remove)
    
    // 중간 삽입 (insert)



    // 배열 얻기
    public String[] getsArr() {
        return sArr;
    }


}
