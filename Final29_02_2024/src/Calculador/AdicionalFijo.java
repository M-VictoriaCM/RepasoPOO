package Calculador;

import Carpinteria.Elemento;

public class AdicionalFijo implements AplicoAdicional{
        private double cargoFijo;

        public AdicionalFijo(double cargoFijo) {
            this.cargoFijo = cargoFijo;
        }

        @Override
        public double calcular(Elemento e) {
            return cargoFijo;
        }
}
