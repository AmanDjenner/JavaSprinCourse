package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//
//       TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

//        Music music = context.getBean("musicBean", Music.class);
//        Music musicRock = context.getBean("musicRockBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicRockPlayer = new MusicPlayer(musicRock);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

//        musicPlayer.playMusic();
        //musicRockPlayer.playMusic();

        boolean comparare = musicPlayer == musicPlayer2;
        boolean compare = musicPlayer.equals(musicPlayer2);

        System.out.println("compararea a doua obiecte prin semn: " +comparare);
        System.out.println("compararea a doua obiecte prin equals() : " +compare);
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer2);
                musicPlayer2.setVolume(12);
//        System.out.println(musicPlayer.getName());
        System.out.println("volumul Playerului 1 este: " +musicPlayer.getVolume());
        System.out.println("volumul Playerului 2 este: " +musicPlayer2.getVolume());


        context.close();
    }
}
