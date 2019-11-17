/**
 * Song class has details of a song and can print it
 * @author Adam Nguyen
 *
 */
public class Song {
	/**
	 * instance variables
	 */
	private String name;
	private String artist;
	private double length;
	private String genre;
	
	/**
	 * parameterized constructor to create a song
	 * @param name
	 * @param artist
	 * @param length
	 * @param genre
	 */
	public Song(String name, String artist, double length, String genre)
	{
		this.name=name;
		this.artist=artist;
		this.length=length;
		this.genre=genre;
	}
	/**
	 * print method to display attributes of a song
	 */
	public void print()
	{
		System.out.println(name+" by "+artist+" category: "+genre+" length: "+length+" min");
	}

}
