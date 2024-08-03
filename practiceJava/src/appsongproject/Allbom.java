package appsongproject;

import java.util.ArrayList;
import java.util.LinkedList;

public class Allbom {
	private String name;
	private String artist;
	private ArrayList<Song>songs;
	
	public Allbom(String name ,String artist) {
		this.name=name;
		this.artist=artist;
		this.songs=new ArrayList<Song>();
	}
	public Allbom() {
		
	}
	public  Song findSong(String titile) {
		//return titile;
		for (Song chechedSong : songs) {
			if (chechedSong.gettitile().equals(titile))return chechedSong;
		}
		return null;
		
	}
	public boolean addsong(String titile, double duration) {
		if (findSong(titile)==null) {
			songs.add(new Song(titile,duration));
			System.out.println(titile+"successfully added the list");
			
			return true;
			
		}
		else {
			System.out.println("song with name "+titile+"alredyexist in tha list");
			return false;
		}
		
	}
	public boolean addPlayList(int trackNubmer,LinkedList<Song> playList) {
		
		int index = trackNubmer - 1;
		if (index>0&&index<=this.songs.size()) {
		playList.add(this.songs.get(index));
		return true;
		}
		
		System.out.println("this albom dose not have song with tracknumber "+trackNubmer);
		return false;
	}
	public boolean addplayList(String titile,LinkedList<Song>playList) {
		for (Song chechedSong :this.songs) {
			if (chechedSong.gettitile().equals(titile)) {
				playList.add(chechedSong);
				return true;
				
			}
			
		}
		//return false;
		//return false;
		System.out.println(titile+"tghe is no scherch song albom");
		return false;
	
		
	}
	public void add(Allbom albom) {
		// TODO Auto-generated method stub
		
	}
	public Allbom get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
