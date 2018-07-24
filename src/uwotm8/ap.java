package uwotm8;

import java.io.*;
import javax.sound.sampled.*;

public final class ap implements Runnable
{
    private AudioInputStream b;
    private DataLine.Info c;
    private Clip d;
    private InputStream e;
    private Thread f;
    private int g;
    private int h;
    public static int a;
    
    public ap(final InputStream e, final int g) {
        if (ap.a == 4 || 9 - ap.a <= 0) {
            return;
        }
        this.e = e;
        this.h = 9;
        this.g = g;
        (this.f = new Thread(this)).start();
    }
    
    @Override
    public final void run() {
        try {
            this.b = AudioSystem.getAudioInputStream(this.e);
            this.c = new DataLine.Info(Clip.class, this.b.getFormat());
            (this.d = (Clip)AudioSystem.getLine(this.c)).open(this.b);
            if (this.d.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                final FloatControl floatControl = (FloatControl)this.d.getControl(FloatControl.Type.MASTER_GAIN);
                float value = 0.0f;
                switch (this.h - ap.a) {
                    case 1: {
                        value = -80.0f;
                        break;
                    }
                    case 2: {
                        value = -70.0f;
                        break;
                    }
                    case 3: {
                        value = -60.0f;
                        break;
                    }
                    case 4: {
                        value = -50.0f;
                        break;
                    }
                    case 5: {
                        value = -40.0f;
                        break;
                    }
                    case 6: {
                        value = -30.0f;
                        break;
                    }
                    case 7: {
                        value = -20.0f;
                        break;
                    }
                    case 8: {
                        value = -10.0f;
                        break;
                    }
                    case 9: {
                        value = -0.0f;
                        break;
                    }
                    case 10: {
                        value = 6.0f;
                        break;
                    }
                    default: {
                        value = 0.0f;
                        break;
                    }
                }
                floatControl.setValue(value);
            }
            else if (this.d.isControlSupported(FloatControl.Type.VOLUME)) {
                final FloatControl floatControl2 = (FloatControl)this.d.getControl(FloatControl.Type.VOLUME);
                floatControl2.setValue((this.h - ap.a) / 10.0f * floatControl2.getMaximum());
            }
            if (this.g > 0) {
                Thread.sleep(this.g);
            }
            this.d.start();
            while (this.d.isRunning()) {
                Thread.sleep(250L);
            }
            Thread.sleep(10000L);
            this.d.close();
            this.b.close();
            this.f.interrupt();
        }
        catch (Exception ex) {
            this.f.interrupt();
            ex.printStackTrace();
        }
    }
}
