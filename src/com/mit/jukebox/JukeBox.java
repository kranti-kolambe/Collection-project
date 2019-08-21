package com.mit.jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.mit.jukebox.List.SongNameComparator;
import com.mit.modal.Song;

public class JukeBox {
	List<Song> songList=new ArrayList<Song>();
	public JukeBox(List<Song> songList) {
		super();
		this.songList = songList;
	}

	 
	public void songDeduplication(List<Song> songList) {
		// TODO Auto-generated method stub
		//Set<Song> songSet= new HashSet(songList);
		Set<Song> songSet= new LinkedHashSet(songList);
		System.out.println("After Removing Duplication ");
		for(Song song:songSet){
			//Collections.sort(songSet,new SongNameComparator() );
			System.out.println(song);
	}
	}


	public void songDisplay(List<Song> songList) {
		// TODO Auto-generated method stub
		for(Song song:songList){
			System.out.println(song);
		}
		/*public void songDisplay(Set<Song> songSet) {
			// TODO Auto-generated method stub
			for(Song song:songSet){
				System.out.println(song);
			}*/
	}


	public void addSongList(List<Song> songList)
	{
		/*File file=new File("songList.txt");
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			String line=null;
			try {
				while((line=br.readLine())!=null){
				 addSong(line);	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		songList.add(new Song("1","Tere Bin","Simba","Rahat","2019"));
		
		songList.add(new Song("2","Tere Bin","Wajir","Arijit","2016"));
		songList.add(new Song("3","Om Namay","Kedarnath","Arijit","2018"));
		songList.add(new Song("4","Mere Dholana","Bhul Bhulaiyya","Shreya","2012"));
		songList.add(new Song("1","Tere Bin","Simba","Rahat","2019"));
	}
	

}
