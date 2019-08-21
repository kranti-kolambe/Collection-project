package com.mit.jukebox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mit.jukebox.List.SongNameComparator;
import com.mit.modal.Song;

public class JukeBoxTest {
	static List<Song> songList=new ArrayList<Song>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Song> songList=new ArrayList<Song>();
		JukeBox jb=new JukeBox(songList);
		jb.addSongList(songList);
		System.out.println("Before Sorting ");
		jb.songDisplay(songList);
		
		Collections.sort(songList);
		System.out.println("Song After sorting using Comparable");
		jb.songDisplay(songList);
		System.out.println("Song After sorting using Comparator");
		Collections.sort(songList, new SongNameComparator());
		jb.songDisplay(songList);
		jb.songDeduplication(songList);
		/*Set<Song> songSet= new HashSet(songList);
		System.out.println("After Removing Duplication ");
		jb.songDisplay(songList);*/
		
	}

}
