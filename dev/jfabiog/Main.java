package dev.jfabiog;
import dev.jfabiog.ent.FabricaPackage.FabricaDeCarrosLuxo;
import dev.jfabiog.ent.FabricaPackage.FabricaDeCarrosPadrao;
import dev.jfabiog.ent.Interfaces.*;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarrosPadrao fabricaPadrao = new FabricaDeCarrosPadrao();
        Sedan sedanPadrao = fabricaPadrao.criarSedan();
        Suv suvPadrao = fabricaPadrao.criaSuv();

        System.out.println("Acaba de ser criado os sequintes carros: ");
        sedanPadrao.descricao();
        suvPadrao.descricao();

        FabricaDeCarrosLuxo fabricaLuxo = new FabricaDeCarrosLuxo();
        Sedan sedanLuxo = fabricaLuxo.criarSedan();
        Suv suvLuxo = fabricaLuxo.criaSuv();

        sedanLuxo.descricao();
        suvLuxo.descricao();
    }
}
