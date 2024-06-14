package edu.unisabana.players;

public interface AudioPlayer {
  void play(AudioFormat audioFormat, String audioFile) throws Exception;
  void stop();
}
