public class Dom_builder implements Dom_interface{
    private int wielkoscPosesji;
    private TypDomu typDomu;
    private int pietra;
    private int ilePomieszczen;
    private Piwnica piwnica;
    private Ogrod ogrod;
    private Garaz garaz;


    @Override
    public void setWielkoscPosesji(int wielkoscPosesji) {
        this.wielkoscPosesji = wielkoscPosesji;
    }

    @Override
    public void setTypDomu(TypDomu typDomu) {
        this.typDomu = TypDomu.valueOf(String.valueOf(typDomu));
    }

    @Override
    public void setLiczbaPieter(int pietra) {
        this.pietra = pietra;
    }

    @Override
    public void setIlePomieszczen(int ilePomieszczen) {
        this.ilePomieszczen = ilePomieszczen;
    }

    @Override
    public void setPiwnica(Piwnica piwnica) {
        this.piwnica = piwnica;
    }

    @Override
    public void setOgrod(Ogrod ogrod) {
        this.ogrod = ogrod;
    }

    @Override
    public void setGaraz(Garaz garaz) {
        this.garaz = garaz;
    }


    public void getWielkoscPosesji() {
        System.out.println("Wielkosc posesji to " + String.valueOf(wielkoscPosesji));
    }

    public void getTypDomu() {
        System.out.println(typDomu);
    }

    public void getLiczbaPieter(){
        System.out.println("Ilość pięter to " + String.valueOf(pietra));
    }

    public void getIlePomieszczen() {
        System.out.println("Ilość pomieszczeń to " + String.valueOf(ilePomieszczen));
    }

    public void getPiwnica() {
        if (piwnica != null) {
            System.out.println("Wielkość piwnicy to " + String.valueOf(piwnica.getPowierzchnia()) + "m kwadratowe.");
            System.out.println(piwnica.getZawartosc());
        }
        else{
            System.out.println("Ten dom nie ma piwnicy");
        }
    }

    public void getOgrod() {
        if (ogrod != null) {
            System.out.println("Wielkość ogrodu to " + String.valueOf(ogrod.getPowierzchnia()) + "m kwadratowe.");
            System.out.println(ogrod.getOpis());
        }
        else {
            System.out.println("ten dom nie ma ogrodu");
        }
    }

    public void getGaraz() {
        if (garaz != null) {
            System.out.println("Wielkość garazu to " + String.valueOf(garaz.getPowierzchnia()) + "m kwadratowe.");
            System.out.println(garaz.getOpis());
        }
        else {
            System.out.println("W tym domu nie ma garażu.");
        }
    }

    public void getAll(){
        getTypDomu();
        getWielkoscPosesji();
        getIlePomieszczen();
        getLiczbaPieter();
        getOgrod();
        getGaraz();
        getPiwnica();
    }
}
