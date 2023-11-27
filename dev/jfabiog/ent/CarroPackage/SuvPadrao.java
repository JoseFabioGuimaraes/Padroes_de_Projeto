package dev.jfabiog.ent.CarroPackage;

import dev.jfabiog.ent.Interfaces.Suv;

public class SuvPadrao implements Suv {

    @Override
    public String getChassi() {
        return "Chassi do SUV padrão";
    }

    @Override
    public int getVelocidadeMaxima() {
        return 200;
    }

    @Override
    public void descricao() {
        System.out.println("SUV padrão");

    }
}
