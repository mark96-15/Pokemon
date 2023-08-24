public class Bulbasor extends Pokemon implements IPlanta{

    public Bulbasor() {
    }



    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Soy Bulbasor y este es mi ataque araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Bulbasor y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasor y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasour y este es mi ataque paralizar");
    }
}
