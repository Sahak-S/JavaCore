package author0011;

public class Author0011 {

    private String Անունը;
    private String Ազգանունը;
    private String Էլհասցե;
    private int տարիքը;
    private String սեռը;

    public Author0011() {

    }

    public String getԱնունը() {
        return Անունը;
    }

    public void setԱնունը(String անունը) {
        Անունը = անունը;
    }

    public String getԱզգանունը() {
        return Ազգանունը;
    }

    public void setԱզգանունը(String ազգանունը) {
        Ազգանունը = ազգանունը;
    }

    public String getԷլհասցե() {
        return Էլհասցե;
    }

    public void setԷլհասցե(String էլհասցե) {
        Էլհասցե = էլհասցե;
    }

    public int getՏարիքը() {
        return տարիքը;
    }

    public void setՏարիքը(int տարիքը) {
        this.տարիքը = տարիքը;
    }

    public String getՍեռը() {
        return սեռը;
    }

    public void setՍեռը(String սեռը) {
        this.սեռը = սեռը;
    }

    public Author0011(String անունը, String ազգանունը, String էլհասցե, int տարիքը, String սեռը) {
        Անունը = անունը;
        Ազգանունը = ազգանունը;
        Էլհասցե = էլհասցե;
        this.տարիքը = տարիքը;
        this.սեռը = սեռը;


    }

    @Override
    public String toString() {
        return "Author0011{" +
                "Անունը='" + Անունը + '\'' +
                ", Ազգանունը='" + Ազգանունը + '\'' +
                ", Էլհասցե='" + Էլհասցե + '\'' +
                ", տարիքը=" + տարիքը +
                ", սեռը='" + սեռը + '\'' +
                '}';
    }
}
