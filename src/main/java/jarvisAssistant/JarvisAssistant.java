//package jarvisAssistant;
//import edu.cmu.sphinx.api.Configuration;
//import edu.cmu.sphinx.api.LiveSpeechRecognizer;
//import edu.cmu.sphinx.api.SpeechResult;
//import com.sun.speech.freetts.Voice;
//import com.sun.speech.freetts.VoiceManager;
//
//import java.awt.*;
//import java.net.URI;
//import java.time.LocalDate;
//
//
//public class JarvisAssistant {
//
//    public static void main(String[] args) {
//
//        JarvisAssistant jarvis = new JarvisAssistant();
//        jarvis.speak("Привет, я Джарвис. Чем могу помочь?");
//        while (true) {
//            String command = jarvis.listen();
//            if (command != null) {
//                jarvis.handleCommand(command);
//            }
//        }
//    }
//
//    public String listen() {
//        try {
//            Configuration config = new Configuration();
//            config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
//            config.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
//            config.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
//
//            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(config);
//            recognizer.startRecognition(true);
//            SpeechResult result = recognizer.getResult();
//            recognizer.stopRecognition();
//            return result.getHypothesis();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public void speak(String text) {
//        VoiceManager vm = VoiceManager.getInstance();
//        Voice voice = vm.getVoice("kevin16");
//        if (voice != null) {
//            voice.allocate();
//            voice.speak(text);
//        }
//    }
//
//    public void handleCommand(String command) {
//        command = command.toLowerCase();
//        if (command.contains("открой браузер")) {
//            openBrowser();
//            speak("Открываю браузер");
//        } else if (command.contains("дата")) {
//            speak("Сегодня " + LocalDate.now());
//        } else if (command.contains("выход")) {
//            speak("До встречи!");
//            System.exit(0);
//        } else {
//            speak("Извините, я не понял команду: " + command);
//        }
//    }
//
//    private void openBrowser() {
//        try {
//            Desktop.getDesktop().browse(new URI("https://google.com"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
