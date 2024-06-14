package edu.unisabana.players;

public class ClassicAudioPlayer implements AudioPlayer{

  @Override
  public void play(AudioFormat audioFormat, String fileName) throws Exception{
    if (audioFormat != AudioFormat.MP3){
      throw new Exception("Invalid Audio Format!");
    }

    System.out.println("Playing Audio file : " + fileName + " [Classic Audio Player]");
  }

  @Override
  public void stop() {
    System.out.println("Audio Stopped [Classic Audio Player]");
  }

}
