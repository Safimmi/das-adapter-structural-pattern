package edu.unisabana.players;

public class AdvancedAudioPlayer {

  public void playMp3(String fileName) {
    System.out.println("Playing MP3 Audio File : " + fileName + " [Advanced Audio Player]");
  }
  
  public void playMp4(String fileName) {
    System.out.println("Playing MP4 Audio file : " + fileName + " [Advanced Audio Player]");
  }
  
  public void playVlc(String fileName) {
    System.out.println("Playing VLC Audio File : " + fileName + " [Advanced Audio Player]");
  }

  public void stop() {
    System.out.println("Audio Stopped [Advanced Audio Player]");
  }
  
}