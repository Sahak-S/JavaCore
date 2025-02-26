package javadas.grup1.internet;

import java.awt.*;

public class FirstApplet extends java.applet.Applet{

    private String date;

    public void init() {
        date = new java.util.Date().toString();
    }
    public void paint(Graphics g) {
        g.drawString("Апплет запущен:", 50, 15);
        g.drawString(date, 50, 35);
    }

    public static void main(String[] args) {
        FirstApplet firstApplet = new FirstApplet();
        firstApplet.init();
        System.out.println(firstApplet.date);
    }

}
