package edu.unisabana.players;

public class AdvancedAudioPlayerAdapter implements AudioPlayer{

  private AdvancedAudioPlayer advancedAudioPlayer;

  public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
    this.advancedAudioPlayer = advancedAudioPlayer;
  }

  @Override
  public void play(AudioFormat audioFormat, String fileName) throws Exception {
    switch (audioFormat) {
      case MP3:
        advancedAudioPlayer.playMp3(fileName);
        break;

      case MP4:
        advancedAudioPlayer.playMp4(fileName);
        break;

      case VLC:
        advancedAudioPlayer.playVlc(fileName);
        break;
    
      default:
        throw new Exception("Invalid Audio Format!");
    }
  }

  @Override
  public void stop() {
    advancedAudioPlayer.stop();
  }

}
