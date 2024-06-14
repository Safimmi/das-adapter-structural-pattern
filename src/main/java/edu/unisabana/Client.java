package edu.unisabana;

import edu.unisabana.players.AudioFormat;
import edu.unisabana.players.AudioPlayer;
import edu.unisabana.players.AdvancedAudioPlayerAdapter;
import edu.unisabana.players.AdvancedAudioPlayer;

public class Client {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
    try {
      audioPlayer.play(AudioFormat.MP4, "file.mp4");
      audioPlayer.stop();
    } catch (Exception e) {
      System.err.println(e.getMessage());
      e.printStackTrace();
    }
  }
  
}