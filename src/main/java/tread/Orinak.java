package tread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Orinak implements  Runnable{

    private FileChannel _channel;
    private FileChannel _writeChannel;
    private int _startLocation;
    private int _size;

//    public OpenFile(int loc, int sz, FileChannel chnl, FileChannel write)
//    {
//        _startLocation = loc;
//        _size = sz;
//        _channel = chnl;
//        _writeChannel = write;
//    }

    public Orinak(int loc, int sz, FileChannel chnl, FileChannel write) {
        _startLocation = loc;
        _size = sz;
        _channel = chnl;
        _writeChannel = write;
    }

    public void run()
    {
        try
        {
            System.out.println("Reading the channel: " + _startLocation + ":" + _size);
            ByteBuffer buff = ByteBuffer.allocate(_size);
            if (_startLocation == 0)
                Thread.sleep(100);
            _channel.read(buff, _startLocation);
            ByteBuffer wbuff = ByteBuffer.wrap(buff.array());
            int written = _writeChannel.write(wbuff, _startLocation);
            System.out.println("Read the channel: " + buff + ":" + new String(buff.array()) + ":Written:" + written);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        FileOutputStream ostr = new FileOutputStream("C:\\Users\\User\\Desktop\\sample.txt");
        FileInputStream str = new FileInputStream("C:\\Users\\User\\Desktop\\sample.txt");
        String b = "Is this written";
        //ostr.write(b.getBytes());
        FileChannel chnl = str.getChannel();
        FileChannel reade = ostr.getChannel();
        ByteBuffer buff = ByteBuffer.wrap(b.getBytes());
        reade.write(buff);
        Thread t1 = new Thread(new Orinak(0, 10000, chnl, reade));
        Thread t2 = new Thread(new Orinak(10000, 10000, chnl, reade));
        Thread t3 = new Thread(new Orinak(20000, 10000, chnl, reade));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        reade.force(false);
        str.close();
        ostr.close();
    }
}

