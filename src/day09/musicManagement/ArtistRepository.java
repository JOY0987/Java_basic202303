package day09.musicManagement;

import day04.array.StringList;

import java.io.*;

public class ArtistRepository {

    private static Artist[] artistList; // 가수 배열

    static {
        artistList = new Artist[0];
    }

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {
        Artist newArtist = new Artist(artistName, new StringList(songName));
        Artist[] temp = new Artist[artistList.length + 1];
        for (int i = 0; i < artistList.length; i++) {
            temp[i] = artistList[i];
        }
        temp[temp.length - 1] = newArtist;
        artistList = temp;
    }
    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    // 있으면 true, 없으면 false
    public boolean isRegistered(String artistName) {
        for (Artist artist : artistList) {
            if (artistName.equals(artist.getName())) {
                return true;
            }
        }
        return false;
    }
    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Artist findArtistByName(String artistName) {
        for (Artist artist : artistList) {
            if (artistName.equals(artist.getName())) {
                return artist;
            }
        }
        return null;
    }
    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean addNewSong(String artistName, String songName) {
        Artist fountArtist = findArtistByName(artistName);
        StringList songList = fountArtist.getSongList();
        if (!songList.includes(songName)) {
            songList.push(songName);
            return true;
        }
        return false;
    }
    // 특정 가수의 노래목록을 반환하는 기능
    public String[] getSongList(String artistName) {
        return findArtistByName(artistName).getSongList().getsArr();
    }
    // 등록된 가수의 수 반환
    public int count() {
        return artistList.length;
    }
    
    // 자동 세이브 기능
    public void autoSave() {

        File f = new File("D:/music");
        if (!f.exists()) f.mkdir();

        try (ObjectOutputStream oos
                     = new ObjectOutputStream(
                             new FileOutputStream("D:/music/m.sav")
        )) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 자동 로드 기능
    public void autoLoad() {

    }

}
