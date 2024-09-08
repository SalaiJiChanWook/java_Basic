package speechtotext;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;

public class SpeechToText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "helloworld";
        int y = 19887;
        // TODO code application logic here
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        //print all voices
        Voice[] voicelist = VoiceManager.getInstance().getVoices();
        for (Voice voicelist1 : voicelist) {
            System.out.println("# voice: " + voicelist1.getName());
        }
        

        if (voice != null) {
            voice.allocate();
            System.out.println("Voice Rate: " + voice.getRate());
            System.out.println("Voice pitch: " + voice.getPitch());
            System.out.println("Voice volumw: " + voice.getVolume());
            AudioPlayer aplayer = new SingleFileAudioPlayer("D:\\wav\\mywave", javax.sound.sampled.AudioFileFormat.Type.WAVE);
            voice.setAudioPlayer(aplayer);
//            boolean status = voice.speak("The time is now, just half past eight");
            boolean status = voice.speak("Hello guys, I'm an Artificial Intelligent designed by salai "+x+y);
            System.out.println("Status: " + status);
            aplayer.close();
            voice.deallocate();
        } else {
            System.out.println("Error in getting Voices");
        }
    }

}
