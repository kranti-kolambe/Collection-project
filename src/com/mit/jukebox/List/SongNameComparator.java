package com.mit.jukebox.List;

import java.util.Comparator;

import com.mit.modal.Song;

public class SongNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Song s1=(Song)o1;
		Song s2=(Song)o2;
	    return s1.getSongTitle().compareTo(s2.getSongTitle());
	}

}
