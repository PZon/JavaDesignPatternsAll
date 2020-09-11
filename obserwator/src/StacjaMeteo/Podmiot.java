package StacjaMeteo;

/**
 * Created by PZON_SM on 27.05.2020.
 **/
public interface Podmiot {
    public void zarejestrujObserwatora(Obserwator o);
    public void usunObserwatora(Obserwator o);
    public void powiadomObserwatorow();
}
