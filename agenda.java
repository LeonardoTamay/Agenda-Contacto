import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos = new ArrayList<>();

    public void agregar(Contacto c) {
        contactos.add(c);
    }

    public void listar() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.println("=== AGENDA DE CONTACTOS ===");
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregar(new Contacto("Ana García",   "987654321", "ana@mail.com"));
        agenda.agregar(new Contacto("Luis Torres",  "912345678", "luis@mail.com"));
        agenda.agregar(new Contacto("María López",  "998877665", "maria@mail.com"));
        agenda.listar();
    }
}