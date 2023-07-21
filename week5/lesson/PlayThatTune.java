public class PlayThatTune {
    public static void main(String[] args) {
        double tempo = Double.parseDouble(args[0]);
        while (!StdIn.isEmpty()) 
        {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble() * tempo;
            double hz = 440 * Math.pow(2, pitch / 12.0);
            double[] a = PlayThatNote.tone(hz, duration);
            StdAudio.play(a);
        }
        StdAudio.close();
    }
}

/******************************************************************************
 *  Compilation:  javac PlayThatTune.java
 *  Execution:    java PlayThatTune < input.txt
 *  Dependencies: StdAudio.java StdAudio.java
 *
 *  This is a data-driven program that plays pure tones from
 *  the notes on the chromatic scale, specified on standard input
 *  by their distance from concert A.
 *
 *  % java PlayThatTune < elise.txt
 *
 *
 *  Data files
 *  ----------
 *  https://introcs.cs.princeton.edu/java/21function/elise.txt
 *  https://introcs.cs.princeton.edu/java/21function/freebird.txt
 *  https://introcs.cs.princeton.edu/java/21function/Ascale.txt
 *  https://introcs.cs.princeton.edu/java/21function/National_Anthem.txt
 *  https://introcs.cs.princeton.edu/java/21function/looney.txt
 *  https://introcs.cs.princeton.edu/java/21function/StairwayToHeaven.txt
 *  https://introcs.cs.princeton.edu/java/21function/entertainer.txt
 *  https://introcs.cs.princeton.edu/java/21function/old-nassau.txt
 *  https://introcs.cs.princeton.edu/java/21function/arabesque.txt
 *  https://introcs.cs.princeton.edu/java/21function/firstcut.txt
 *  https://introcs.cs.princeton.edu/java/21function/tomsdiner.txt
 *
 ******************************************************************************/
