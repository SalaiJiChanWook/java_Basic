package Project;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import java.util.Scanner;

public class ProductMain {

    static Scanner input = new Scanner(System.in);
    static int system;

    public static void main(String[] args) {

        ProductMain pdtMain = new ProductMain();
        pdtMain.status();

    }

    public void status() {

   System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();    

        System.out.println("Welcome to Warehouse Allocation System");
        System.out.println("=========================================");
         if (voice != null) {
            voice.allocate();
            boolean athan = voice.speak("Hello every one welcome to the Warehouse Allocation System "
                    + "I am an Artificial Intelligent" + "What can I help you ?");
        }
        WarehouseProduct product = new WarehouseProduct();
        product.choice();
        
        
    }

}
