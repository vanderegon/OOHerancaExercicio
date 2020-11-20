
import java.util.*;

public class SaqueDinheiro extends ContaCorrente {




    public SaqueDinheiro(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo, chequeEspecial);
    }

    @Override
    public String toString() {
        return "SaqueDinheiro{" +
                "saldo=" + this.saldo +
                '}';
    }

    public double getSaldo(){
        return this.saldo;
    }
}
