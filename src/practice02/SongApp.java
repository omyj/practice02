package practice02;

public class SongApp {
	public static void main(String[] args) {
		Song song = new Song();
		
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		song.setComposer("이수민");
	
		song.show();		// 기존 메소드
		song.show(false);   // 오버로드 하는 메소드
	}
}
