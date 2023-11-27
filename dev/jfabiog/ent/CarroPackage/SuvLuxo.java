package dev.jfabiog.ent.CarroPackage;

import dev.jfabiog.ent.Interfaces.Suv;

public class SuvLuxo implements Suv {
    @Override
    public String getChassi() {
        return "Chassi do SUV de luxo";
    }

    @Override
    public int getVelocidadeMaxima() {
        return 257;
    }

    @Override
    public void descricao() {
        System.out.println("SUV de luxo");
    }
}
