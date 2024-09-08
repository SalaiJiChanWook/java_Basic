
package com.voicerecog.test;

import edu.cmu.sphinx.api.Configuration;

/**
 *
 * @author DELL-PC
 */
public class VoiceRecognizer {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        
        config.setAcousticModelPath("resource:/edu/cumu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("");
        config.setLanguageModelPath("");
    }
}
