package ba.bitcamp.homework;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Creating two objects from class Singer
		Singer a1 = new Singer("Dino Merlin", false, 1980, "Pop");
		Singer a2 = new Singer("Oliver Dragojevic", false, 1970, "Pop");

		// Creating three different songs from these artists.
		Song song1 = new Song(a1, "Ruza", 2014, "Pop");
		Song song2 = new Song(a2, "Cesarica", 1995, "Pop");
		Song song3 = new Song(a1, "Rane", 2014, "Pop");
		Song song4 = new Song(a2, "Kad mi dodjes ti", 2005, "Pop");

		// Song arrays which represent songs from one album
		Song[] albumSongs = new Song[2];
		albumSongs[0] = new Song(a1, "Ruza", 2014, "Pop");
		albumSongs[1] = new Song(a1, "Rane", 2014, "Pop");
		Song[] albumSongs2 = new Song[2];
		albumSongs2[0] = new Song(a2, "Cesarica", 1995, "Pop");
		albumSongs2[1] = new Song(a2, "Kad mi dodjes ti", 2005, "Pop");

		// Creating objects for class Album
		Album alb1 = new Album("Hotel Nacional", a1, albumSongs, "Pop");
		Album alb2 = new Album("Cesarica", a2, albumSongs2, "Pop");

		// Album arrays from those two artists
		Album[] albums = new Album[2];
		albums[0] = new Album("Hotel Nacional", a1, albumSongs, "Pop");
		albums[1] = new Album("Cesarica", a2, albumSongs2, "Pop");

		Singer[] artists = new Singer[2];
		artists[0] = new Singer("Dino Merlin", false, 1980, "Pop");
		artists[1] = new Singer("Oliver Dragojevic", false, 1970, "Pop");

		Concert c1 = new Concert(artists, albumSongs);

		// Task 3: Printing method isSameAuthor
		System.out.println("Whether the same artists: " + song1.songName
				+ " and " + song2.songName + ": " + isSameAuthor(song1, song2));

		// Task 4: Printing method ifFromSoloAuthor
		System.out.println("Is this song made by Band: "
				+ ifFromSoloAuthor(song1));
		// Task 5: Printing method getOlderSong
		System.out.println("The older song is: "
				+ getOlderSong(song1, song2).songName);
		// Task 6: Printing method countGenreNumber
		System.out.println("There is " + countGenreNumber(alb1, "Pop")
				+ " songs of that genre in this album");
		// Task 7: Printing method printAlbumInformation
		printAlbumInformation(albums, albumSongs[0]);

		// Task 10: Printing method getNumberOfSongsPerAlbum
		int[] array = getNumberOfSongsPerAlbum(c1, albums);
		System.out.println("Number of songs per album:"+Arrays.toString(array));
	}

	/**
	 * <h1>This method compares two songs</h1>
	 * <p>
	 * 
	 * @param s1
	 *            - represents song1
	 * @param s2
	 *            - represents song2
	 * @return true - if artists are same, false if artists are different
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.musicArtist.name.equals(s2.musicArtist.name)) {
			return true;
		}
		return false;
	}

	/**
	 * <h1>This method checks if the song is from solo author</h1>
	 * <p>
	 * 
	 * @param s1
	 *            - represents our song
	 * @return True if the song is played by band, else false.
	 */

	public static boolean ifFromSoloAuthor(Song s1) {
		if (s1.musicArtist.isBand == true) {
			return true;
		} else
			return false;
	}

	/**
	 * <h1>This method checks which song is older</h1>
	 * <p>
	 * 
	 * @param s1
	 *            - represents song1 from class Song
	 * @param s2
	 *            - represents song2 from class Song
	 * @return Older song
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		return (s1.yearOfRelease > s2.yearOfRelease) ? s2 : s1;
	}

	/**
	 * <h1>This method counts selected genre (number of songs)</h1>
	 * <p>
	 * @param a - represents album
	 * @param genre - represents selected song genre
	 * @return Number of songs with selected genre
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;

		for (int i = 0; i < a.artistSongs.length; i++) {
			if (genre.equals(a.artistSongs[i].genre)) {
				counter++;
			}
		}
		return counter;

	}

	/**
	 * <h1>This method prints if the song is part of selected Album</h1>
	 * <p>
	 * @param a - array from class Album
	 * @param s - song from class Song
	 */
	public static void printAlbumInformation(Album[] a, Song s) {
		Album al1 = null;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].artistSongs.length; j++) {

				if (s.songName.equals(a[i].artistSongs[i].songName)) {

					al1 = a[i];
				}
			}
		}
		System.out.println(al1.nameAlbum);
	}

	/**
	 * <h1>This method prints if the song is part of selected Album</h1>
	 * <p>
	 * @param c - class concert
	 * @param a - array from class Album
	 * @return - number of songs per album
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int[] array = new int[a.length];
		for (int i = 0; i < c.arraySong.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int z = 0; z < a[j].artistSongs.length; z++) {
					if (c.arraySong[i].equals(a[j].artistSongs[z])) {
						array[j] += 1;
					}
				}
			}
		}
		return array;
	}
}
