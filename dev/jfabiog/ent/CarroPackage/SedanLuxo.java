package dev.jfabiog.ent.CarroPackage;

import dev.jfabiog.ent.Interfaces.Sedan;


public class SedanLuxo implements Sedan {
        @Override
        public String getChassi() {
            return "Chassi do Sedan de Luxo";
        }

        @Override
        public int getVelocidadeMaxima() {
            return 240;
        }

        @Override
        public void descricao() {
            System.out.println("Sedan de Luxo");
        }
    }
