public class Architekt {

    public void zbudujMalyDomJednorodzinny(Dom_builder dom_builder){
        dom_builder.setWielkoscPosesji(50);
        dom_builder.setTypDomu(TypDomu.JEDNORODZINNY);
        dom_builder.setLiczbaPieter(1);
        dom_builder.setIlePomieszczen(6);
        dom_builder.setPiwnica(new Piwnica(2,"Mała zagracona piwnica"));
        dom_builder.setOgrod(new Ogrod(5,"Mały ogródek"));
        dom_builder.setGaraz(new Garaz(4, "Mały blaszany garaż w którym stoi niesptawny maluch"));
    }

    public void zbudujWilleZbasenem(Dom_builder dom_builder){
        dom_builder.setWielkoscPosesji(300);
        dom_builder.setTypDomu(TypDomu.WILLA);
        dom_builder.setLiczbaPieter(4);
        dom_builder.setIlePomieszczen(26);
        dom_builder.setPiwnica(new Piwnica(10,"Duża piwnica pełna beczek z winem i koparek bitcoina"));
        dom_builder.setOgrod(new Ogrod(20,"Duży ogród z ogromnym basenem."));
        dom_builder.setGaraz(new Garaz(15, "Garaż z czterema miejscami na sportowe auta, jest tam również ładowarka do aut elektrycznych"));
    }
}
