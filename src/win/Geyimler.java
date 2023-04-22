package win;

public class Geyimler implements Geyim {

    Marka marka;

    public Geyimler(Marka marka){
        this.marka = marka;
    }


    @Override
    public void geyim() {
        String  geyimlerMarka = marka.marka();
    }
}
