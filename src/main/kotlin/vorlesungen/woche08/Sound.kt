package vorlesungen.woche08

import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl


fun main() {
    var path = "src/main/kotlin/vorlesungen/woche08/cash.wav"

    // Sound bricht sofort ab, da Programm in der nächsten Zeile schon beendet ist, brauchen hier Thread.sleep.
    playSound(path)
    // Braucht ihr in eurem Store nicht, da er weiterläuft
    Thread.sleep(2000)

}

fun playSound(audioPath: String) {
    // Erstelle eine File aus dem angegebenen Dateipfad
    val audio: File = File(audioPath)

    // Hier wird die audio in das Audiosystem gepackt
    val audioInput: AudioInputStream = AudioSystem.getAudioInputStream(audio)

    // es wird ein Clip-Objekt erstellt um den Sound abzuspielen
    val clip: Clip = AudioSystem.getClip()


    // clip öffnen, audio laden
    clip.open(audioInput)


    // Starte die Wiedergabe des Sounds
    clip.start()


    // Volume Control:
    // FloatControl steuert Audios (zB Lautstärke)
    // MASTER_GAIN ist eine spezielle Art von FloatControl, die die Lautstärke eines Audio-Clips regelt
    if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)){
        val volume: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl
        volume.value = volume.minimum+(0.99f*(volume.maximum-volume.minimum))
    }

}
