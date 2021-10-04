class MusicRunner{
	public static void main(String[] hares)
	{
		Music music=new Music(MusicType.CARNATIC,true);
		music.pitch="high";
		System.out.println(music.type);
		System.out.println(music.musicMelody);
		System.out.println(music.playerName);
		System.out.println(music.pitch);
		
			
		
	}
}