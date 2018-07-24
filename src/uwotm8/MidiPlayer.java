package uwotm8;

import java.io.*;
import javax.sound.midi.*;

public final class MidiPlayer implements Receiver
{
    private int a;
    private final int[] b;
    private final Receiver c;
    private final Sequencer d;
    
    public MidiPlayer() {
        this.b = new int[16];
        this.c();
        Receiver receiver = null;
        Sequencer d = null;
        try {
            receiver = MidiSystem.getReceiver();
            (d = MidiSystem.getSequencer(false)).getTransmitter().setReceiver(this);
            d.open();
        }
        catch (Exception ex) {
            try {
                System.out.println(ex);
                System.out.println("Trying Windows 10 Midi device compatability");
                int n = -1;
                final MidiDevice.Info[] midiDeviceInfo = MidiSystem.getMidiDeviceInfo();
                for (int i = 0; i < midiDeviceInfo.length; ++i) {
                    System.out.println("Midi device: " + midiDeviceInfo[i].getName());
                    if (midiDeviceInfo[i].getName().equals("Microsoft MIDI Mapper") || midiDeviceInfo[i].getName().equals("Real Time Sequencer")) {
                        n = i;
                        break;
                    }
                }
                if (n >= 0) {
                    System.out.println("Selecting Midi device " + midiDeviceInfo[n]);
                    MidiSystem.getMidiDevice(midiDeviceInfo[n]);
                    receiver = MidiSystem.getMidiDevice(midiDeviceInfo[n]).getReceiver();
                    (d = MidiSystem.getSequencer()).getTransmitter().setReceiver(receiver);
                    d.getTransmitter().setReceiver(this);
                    d.open();
                }
            }
            catch (Exception ex2) {
                System.out.println(ex2);
                System.out.println("Something went really wrong, bug a dev for better sound support :^)");
            }
        }
        this.c = receiver;
        this.d = d;
        this.a(-1L);
    }
    
    public final synchronized void a(final int n, final int n2) {
        this.a(0, n2, -1L);
    }
    
    public final synchronized void a(final boolean b) {
        if (this.d != null) {
            this.d.setLoopCount(b ? -1 : 0);
        }
    }
    
    public final void playMidi(final byte[] array, final boolean b, final int n) {
        try {
            if (this.d != null) {
                this.d.setSequence(MidiSystem.getSequence(new ByteArrayInputStream(array)));
                this.d.setLoopCount(b ? -1 : 0);
                this.a(0, n, -1L);
                this.d.start();
            }
        }
        catch (InvalidMidiDataException ex2) {}
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public final boolean isSequencerRunning() {
        return this.d != null && this.d.isRunning();
    }
    
    public final void stopPlayback() {
        if (this.d != null) {
            this.d.stop();
        }
        this.a(-1L);
    }
    
    private void a(final long n) {
        for (int i = 0; i != 16; ++i) {
            this.a(i + 176, 123, 0, -1L);
        }
        for (int j = 0; j != 16; ++j) {
            this.a(j + 176, 120, 0, -1L);
        }
        for (int k = 0; k != 16; ++k) {
            this.a(k + 176, 121, 0, -1L);
        }
        for (int l = 0; l != 16; ++l) {
            this.a(l + 176, 0, 0, -1L);
        }
        for (int n2 = 0; n2 != 16; ++n2) {
            this.a(n2 + 176, 32, 0, -1L);
        }
        for (int n3 = 0; n3 != 16; ++n3) {
            this.a(n3 + 192, 0, 0, -1L);
        }
    }
    
    private void a(final int n, final int n2, final int n3, final long n4) {
        try {
            if (this.c != null) {
                final ShortMessage shortMessage;
                (shortMessage = new ShortMessage()).setMessage(n, n2, n3);
                this.c.send(shortMessage, n4);
            }
        }
        catch (InvalidMidiDataException ex) {}
    }
    
    private void b(final long n) {
        for (int i = 0; i != 16; ++i) {
            final int a = this.a(i);
            this.a(i + 176, 7, a >>> 7, n);
            this.a(i + 176, 39, a & 0x7F, n);
        }
    }
    
    private void a(final int n, int a, final long n2) {
        a = (int)(a * Math.pow(0.1, n * 5.0E-4) + 0.5);
        if (this.a == a) {
            return;
        }
        this.a = a;
        this.b(-1L);
    }
    
    private int a(int n) {
        return (int)(Math.sqrt(((n = this.b[n]) * this.a >>> 8) * n) + 0.5);
    }
    
    private void c() {
        for (int i = 0; i != 16; ++i) {
            this.b[i] = 12800;
        }
    }
    
    private boolean b(final int n, int n2, final int n3, final long n4) {
        if ((n & 0xF0) == 0xB0) {
            if (n2 == 121) {
                this.a(n, n2, n3, n4);
                final int n5 = n & 0xF;
                this.b[n5] = 12800;
                n2 = this.a(n5);
                this.a(n, 7, n2 >>> 7, n4);
                this.a(n, 39, n2 & 0x7F, n4);
                return true;
            }
            if (n2 == 7 || n2 == 39) {
                final int n6 = n & 0xF;
                if (n2 == 7) {
                    final int n7 = n6;
                    final int[] b = this.b;
                    b[n7] = ((b[n6] & 0x7F) | n3 << 7);
                }
                else {
                    final int n8 = n6;
                    final int[] b2 = this.b;
                    b2[n8] = ((b2[n6] & 0x3F80) | n3);
                }
                n2 = this.a(n6);
                this.a(n, 7, n2 >>> 7, n4);
                this.a(n, 39, n2 & 0x7F, n4);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final synchronized void send(final MidiMessage midiMessage, final long n) {
        final byte[] message;
        if (this.c != null && ((message = midiMessage.getMessage()).length < 3 || !this.b(message[0], message[1], message[2], n))) {
            this.c.send(midiMessage, n);
        }
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    protected final void finalize() throws Throwable {
        try {
            if (this.d != null) {
                this.d.close();
            }
            if (this.c != null) {
                this.c.close();
            }
        }
        finally {
            super.finalize();
        }
        super.finalize();
    }
}
