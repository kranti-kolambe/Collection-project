package com.mit.modal;

public class Song implements Comparable<Song>{
String songId;
String songTitle;
String songMovie;
String singer;
String releasedYear;
public Song(String songId, String songTitle, String songMovie, String singer, String releasedYear) {
	super();
	this.songId = songId;
	this.songTitle = songTitle;
	this.songMovie = songMovie;
	this.singer = singer;
	this.releasedYear = releasedYear;
}
public String getSongId() {
	return songId;
}
public void setSongId(String songId) {
	this.songId = songId;
}
public String getSongTitle() {
	return songTitle;
}
public void setSongTitle(String songTitle) {
	this.songTitle = songTitle;
}
public String getSongMovie() {
	return songMovie;
}
public void setSongMovie(String songMovie) {
	this.songMovie = songMovie;
}
public String getSinger() {
	return singer;
}
public void setSinger(String singer) {
	this.singer = singer;
}
public String getReleasedYear() {
	return releasedYear;
}
public void setReleasedYear(String releasedYear) {
	this.releasedYear = releasedYear;
}
@Override
public String toString() {
	return "Song [songId=" + songId + ", songTitle=" + songTitle + ", songMovie=" + songMovie + ", singer=" + singer
			+ ", releasedYear=" + releasedYear + "]";
}
@Override
public int compareTo(Song s) {
	// TODO Auto-generated method stub
	int r= this.getSongTitle().compareTo(s.getSongTitle());
	return r;
}
@Override
public int hashCode(){
	System.out.println(this.getSongTitle() +"hash Code is "+this.getSongTitle().hashCode());
	return this.getSongTitle().hashCode();
	
}
@Override
public boolean equals(Object ob){
	Song os1=(Song) ob;
	return this.getSongTitle().equals(os1.getSongTitle());
	
}






}
