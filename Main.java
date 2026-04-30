
 class IR implements Imposto {

    public double valorImposto(double valorBase) {
        return (valorBase * 3) / 100;
    }
}

 class IPTU implements Imposto {

    public double valorImposto(double valorBase) {
        return (valorBase * 1.5) / 100;
    }
}

 class IPVA implements Imposto {

    public double valorImposto(double valorBase) {
        return (valorBase * 2.33) / 100;
    }
}

 class CalculadoraImposto {
     double calcularImposto(Imposto imposto, double valorBase) {
         return imposto.valorImposto(valorBase);
     }
 }