import java.util.Iterator;
/**
 * Implements built in iterator
 * @author Adam Nguyen
 *
 */
public class AlbumIterator implements Iterator {
	/**
	 * Has song array and int position
	 */
	private Song[] song;
	private int position;
	
	/**
	 * Sets song array to parameter
	 * @param songs
	 */
	AlbumIterator(Song[] songs)
	{
		this.song=songs;
		this.position=0;
	}
	/**
	 * returns true if the array can be iterated, otherwise false
	 */
	public boolean hasNext()
	{
		if(position>=song.length||song[position]==null)
			return false;
		else
			return true;
	}
	/**
	 * returns next song
	 */
	public Song next()
	{
		Song reSong= song[position];
		position++;
		return reSong;
	}

}
