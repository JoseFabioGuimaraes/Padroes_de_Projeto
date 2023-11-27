package dev.jfabiog.ent.CarroPackage;

import dev.jfabiog.ent.Interfaces.Sedan;

public class SedanPadrao implements Sedan {
    @Override
    public String getChassi() {
        return "Chassi do Sedan Padrão";
    }

    @Override
    public int getVelocidadeMaxima() {
        return 180;
    }

    @Override
    public void descricao() {
        System.out.println("Sedan Padrão");
    }
}
