public class Main {

    public static void main(String[] args) {

        Architekt architekt = new Architekt();
        Dom_builder dom_builder = new Dom_builder();
        architekt.zbudujMalyDomJednorodzinny(dom_builder);

        dom_builder.getAll();

        System.out.println("=========================");
        architekt.zbudujWilleZbasenem(dom_builder);
        dom_builder.getAll();

    }
}
