package StacjaMeteo;

/**
 * Created by PZON_SM on 10.06.2020.
 **/
public class StatystykaWyswietl implements  Obserwator, WyswietlElement  {
    private float maxTemp=0.0f;
    private  float minTemp = 200;
    private float tempSum=0.0f;
    private int nrOdczytow;
    private DanePogodowe danePogodowe;

    public StatystykaWyswietl(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void akltualizacja(float temp, float wilgotnosc, float cisnienie) {
      tempSum = tempSum + temp;
      nrOdczytow++;

      if(temp>maxTemp) maxTemp = temp;

      if(temp<minTemp) minTemp = temp;

      wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Avg/MAX/MIN TEMP = "+(tempSum/nrOdczytow)+" / "
        + maxTemp+" / "+minTemp);
    }
}
