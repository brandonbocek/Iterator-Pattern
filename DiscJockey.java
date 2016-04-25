package Iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public DiscJockey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s){
		iter70sSongs = songs70s;
		iter80sSongs = songs80s;
		iter90sSongs = songs90s;
	}
	/*
	public void showTheSongs(){
	//cycling through an arraylist
		ArrayList aL70sSongs = songs70s.getBestSongs();
		System.out.println("Songs of the 70s\n");
		for(int i=0;i<aL70sSongs.size();i++){
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
			System.out.print(bestSongs.getSongName()+", ");
			System.out.print(bestSongs.getBandName()+", ");
			System.out.println(bestSongs.getYearReleased());
		}
	//cycling through an object array
		SongInfo[] array80sSongs = songs80s.getBestSongs();
		System.out.println("\nSongs of the 80s\n");
		for(int i=0;i<array80sSongs.length;i++){
			SongInfo bestSongs = array80sSongs[i];
			System.out.print(bestSongs.getSongName()+", ");
			System.out.print(bestSongs.getBandName()+", ");
			System.out.println(bestSongs.getYearReleased());
		}
	//cycling through a hashtable
		Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
		System.out.println("\nSongs of the 90s\n");
		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();){
			SongInfo bestSongs = ht90sSongs.get(e.nextElement());
			System.out.print(bestSongs.getSongName()+", ");
			System.out.print(bestSongs.getBandName()+", ");
			System.out.println(bestSongs.getYearReleased());
		}
	}
	*/
	public void showTheSongs2(){
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s);
		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s);
	}
	public void printTheSongs(Iterator i){
		while(i.hasNext()){
			
			SongInfo songInfo = (SongInfo) i.next();
			System.out.print(songInfo.getSongName()+", ");
			System.out.print(songInfo.getBandName()+", ");
			System.out.println(songInfo.getYearReleased());
		}
	}
}
