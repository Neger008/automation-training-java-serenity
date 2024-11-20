public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0 ){
            saldo = saldo + monto;

            System.out.println("Depósito exitoso. Saldo actual: "+saldo);
        }else{
            System.out.println("El monto debe ser mayor a 0");
        }
    }

    public void retirar(double monto) throws Exception {
        if(monto > saldo){
            throw new Exception("Saldo insuficiente, no se puede retirar el monto: " + monto);
        }else{
            saldo = saldo - monto;
            System.out.println("Retiro exitoso. Saldo actual: "+saldo);
        }
    }

    public double getSaldo(){
        return saldo;
    }

}
