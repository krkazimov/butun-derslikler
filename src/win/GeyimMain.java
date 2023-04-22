package win;

public class GeyimMain {

    public static void main(String[] args) {
      Marka marka = new ZaraMarka();
      Geyim geyim = new Geyimler(marka);
        marka.marka();
    }
}
