package day10.collection.song;

import day04.array.StringList;

import java.util.Set;

public class Artist {
    // 필드
    private String name;

    // 노래 배열
    private Set<String> songList;

    // 생성자
    public Artist(String name, Set<String> musicList) {
        this.name = name;
        this.songList = musicList;
    }

    // 게터, 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    // 가수의 정보를 출력하는 기능
    public void info() {
        System.out.println("가수명: " + this.name);
        System.out.println("노래 목록: " + this.songList);
    }
}
