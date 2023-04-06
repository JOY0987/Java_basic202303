package day09.musicManagement;

import static day07.Util.Utility.*;

// 입출력
public class ArtistView {

    private static ArtistRepository ar;

    static {
        ar = new ArtistRepository();
    }

    // 메인 실행 기능
    public static void run() {
        while (true) {
            showMenu();
            int n = Integer.parseInt(input(">> "));
            switch (n) {
                case 1: // 노래 등록
                    insertProcess();
                    break;
                case 2: // 노래 정보 검색
                    searchProcess();
                    break;
                case 3: // 프로그램 종료
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다!");
            }
        }
    }

    private static void searchProcess() {
        System.out.println("# 검색할 가수명을 입력하세요.");
        String findArtist = input("- 가수명: ");
        if (ar.isRegistered(findArtist)) {
            // 있으면 true
            System.out.printf("# %s님의 노래목록", findArtist);
            makeLine();
            String[] foundSongList = ar.getSongList(findArtist);
            for (int i = 0; i < foundSongList.length; i++) {
                System.out.printf("* %d. %s\n", i+1, foundSongList[i]);
            }
        } else {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }
        stop();
    }

    private static void insertProcess() {
        // 노래등록
        System.out.println("# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명: ");
        String songName = input("- 곡명: ");
        // 신규 가수인가?
        if (!ar.isRegistered(artistName)) {
            ar.addNewArtist(artistName, songName);
            System.out.printf("# %s님이 신규 등록되었습니다.\n", artistName);
        } else { // 기존 가수인 경우
            boolean flag = ar.addNewSong(artistName, songName);
            if (flag) {
                System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.\n", artistName, songName);
            } else {
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
            }
        }
        stop();
    }

    private static void showMenu() {
        String message = "**** 음악 관리 프로그램 ****\n";
        message += String.format("# 현재 등록된 가수: %d명\n", ar.count());
        message += "# 1. 노래 등록하기\n";
        message += "# 2. 노래 정보 검색\n";
        message += "# 3. 프로그램 종료\n";
        System.out.println(message);
        makeLine();
    }
}
