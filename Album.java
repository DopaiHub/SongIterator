/**
 * Album class contains an array of songs
 * @author Adam Nguyen
 *
 */
public class Album{
	/**
	 * instance variables
	 */
	private Song[] songs;
	private int count;
	private String name;
	
	/**
	 * constructor gives the album a name, sets count to 0, and makes the array size 20
	 * @param name
	 */
	public Album(String name)
	{
		this.name=name;
		this.count=0;
		this.songs=new Song[20];
	}
	/**
	 * addSong method adds song to array if there is space
	 * @param name
	 * @param artist
	 * @param length
	 * @param genre
	 */
	public void addSong(String name,String artist,double length,String genre)
	{
		Song song=new Song(name,artist,length,genre);
		if(count>=songs.length)
		{
			System.out.println("Sorry, song list is full.");
		}
		else
		{
			songs[count]=song;
			count++;
		}
	}
	/**
	 * returns new AlbumIterator
	 * @return
	 */
	public AlbumIterator createIterator()
	{
		return new AlbumIterator(songs);
	}

}
