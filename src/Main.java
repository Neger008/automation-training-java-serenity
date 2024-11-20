public class Main {
    public static void main(String[] args) {
//        CuentaBancaria cuenta = new CuentaBancaria(1000);
//
//        System.out.println("Saldo: "+cuenta.getSaldo());
//
////        cuenta.saldo = -100;
//        cuenta.deposital(100);
//        System.out.println("Saldo: "+cuenta.getSaldo());

//        Auto auto = new Auto();
//        auto.encender();
//
//        Moto moto = new Moto();
//        moto.encender();

//        Auto auto = new Auto();
//        Moto moto = new Moto();
//
//        auto.hacerRuido();
//        auto.encender();
//        moto.hacerRuido();
//        moto.encender();


//        try{
//            int resultado = 10/0;
//        }catch (ArithmeticException e){
//            System.out.println("No se puede dividir entre 0");
//        }catch (Exception e){
//            System.out.println("Ocurrio un error");
//        }
//
//        System.out.println("El programa sigue ejecutandose");
        try {
            CuentaBancaria cuenta1 = new CuentaBancaria(1000);
            cuenta1.depositar(500);
            cuenta1.retirar(200);

            System.out.println("Saldo cuenta 1: " + cuenta1.getSaldo());
            System.out.println("****************************************");
            CuentaAhorros cuentaAhorros = new CuentaAhorros(2000, 0.05);
            System.out.println("Saldo cuenta ahorros sin interes: " + cuentaAhorros.getSaldo());
            cuentaAhorros.aplicarInteres();

            System.out.println("Saldo cuenta ahorros con interes: " + cuentaAhorros.getSaldo());

            cuenta1.retirar(2000);

        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}