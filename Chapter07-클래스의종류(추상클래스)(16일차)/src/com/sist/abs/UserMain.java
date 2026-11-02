package com.sist.abs;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms=new GenieMusic();
		ms.dataCollection();
		Music[] musics=ms.musicList();
		for(Music m:musics)
		{
			System.out.println(m.getMno()+"."+m.getTitle());
		}
		
		System.out.println("====================");
		ms=new MelonMusic();
		ms.dataCollection();
		musics=ms.musicList();
		for(Music m:musics)
		{
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}

}
