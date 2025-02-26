package googleCloud;

import com.google.cloud.speech.v1.*;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.RecognitionAudio;
import com.google.protobuf.ByteString;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URI;
import java.awt.Desktop;
public class VoiceGoogleOpener {

    public static void main(String[] args) throws Exception {
        // Настроим аудио
        AudioFormat format = new AudioFormat(16000, 16, 1, true, false);
        TargetDataLine line = AudioSystem.getTargetDataLine(format);
        line.open(format);
        line.start();

        System.out.println("Слушаю ваш голос...");

        // Буфер для записи
        byte[] data = new byte[1024];
        int numBytesRead;

        // Запись в поток
        while (true) {
            numBytesRead = line.read(data, 0, data.length);
            if (numBytesRead > 0) {
                // Используем Google Cloud Speech для распознавания
                try (SpeechClient speechClient = SpeechClient.create()) {
                    RecognitionAudio audio = RecognitionAudio.newBuilder()
                            .setContent(ByteString.copyFrom(data, 0, numBytesRead))
                            .build();

                    RecognitionConfig config = RecognitionConfig.newBuilder()
                            .setEncoding(RecognitionConfig.AudioEncoding.LINEAR16)
                            .setSampleRateHertz(16000)
                            .setLanguageCode("ru-RU")
                            .build();

                    RecognizeResponse response = speechClient.recognize(config, audio);
                    for (SpeechRecognitionResult result : response.getResultsList()) {
                        String transcript = result.getAlternativesList().get(0).getTranscript();
                        System.out.println("Распознанный текст: " + transcript);

                        // Проверяем, что сказано 'Google'
                        if (transcript.toLowerCase().contains("google")) {
                            openGoogle();
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Метод для открытия Google в браузере
    public static void openGoogle() {
        try {
            URI uri = new URI("https://www.google.com");
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(uri);
            } else {
                System.out.println("Не поддерживается открытие браузера.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
