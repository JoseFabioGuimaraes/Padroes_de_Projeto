package dev.jfabiog.ent.FabricaPackage;

import dev.jfabiog.ent.CarroPackage.SedanLuxo;
import dev.jfabiog.ent.CarroPackage.SuvLuxo;
import dev.jfabiog.ent.Interfaces.FabricaDeCarrosInterface;
import dev.jfabiog.ent.Interfaces.Sedan;
import dev.jfabiog.ent.Interfaces.Suv;

public class FabricaDeCarrosLuxo implements FabricaDeCarrosInterface {

    @Override
    public Sedan criarSedan() {
        return new SedanLuxo();
    }

    @Override
    public Suv criaSuv() {
        return new SuvLuxo();
    }
}
