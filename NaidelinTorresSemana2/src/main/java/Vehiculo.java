public class Vehiculo {
    public void mostrarInfo() {
        System.out.println("Informacion general del vehiculo.");
    }

    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Vehiculo(),
            new Auto(),
            new Moto(),
            new Bicicleta()
        };

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}

class Auto extends Vehiculo {
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: vehiculo, ideal para la ciudad.");
    }
}

class Moto extends Vehiculo {
    @Override
    public void mostrarInfo() {
        System.out.println("Moto: vehiculo, agil y compacto.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void mostrarInfo() {
        System.out.println("Bicicleta: vehiculo sin motor, ecologico y saludable.");
    }
}
