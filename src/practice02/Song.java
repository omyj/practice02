package practice02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	/////////////////
	// 생성자 오버로드
	// 빈 기본생성자
	public Song() {
		// TODO Auto-generated constructor stub
	}

	// 개발자가 임의로 만든 생성자
	public Song(String artist, String title, String album, int year, int track, String composer) {
		// TODO Auto-generated constructor stub

	}

	// 생성자 오버로드
	public Song(String artist, String title) {
		// TODO Auto-generated constructor stub
		this(artist, title, null, 0, 0, null);

	}

	/////////////////////////
	// 메소드 오버로드; 기존 메소드를 지우지 않고 내가 원하는 기능을가진 메소드를 만들어 boolean값으로 사용
	public void show() {
		System.out
				.println(artist + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}

	public void show(boolean visible) {
		System.out.println("메소드 오버로드 됨");
	}

	
	////////////////////////
	// Getter, Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

}
