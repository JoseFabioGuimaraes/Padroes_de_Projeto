package dev.jfabiog.ent.FabricaPackage;

import dev.jfabiog.ent.CarroPackage.SedanPadrao;
import dev.jfabiog.ent.CarroPackage.SuvPadrao;
import dev.jfabiog.ent.Interfaces.FabricaDeCarrosInterface;
import dev.jfabiog.ent.Interfaces.Sedan;
import dev.jfabiog.ent.Interfaces.Suv;

public class FabricaDeCarrosPadrao implements FabricaDeCarrosInterface {
    @Override
    public Sedan criarSedan() {
        return new SedanPadrao();
    }
    @Override
    public Suv criaSuv() {
        return new SuvPadrao();
    }
}
