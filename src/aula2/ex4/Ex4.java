package aula2.ex4;

public class Ex4 {
    public static void main(String[] args) {
        FuncionarioCLT tecnico = new Tecnico(1);
        tecnico.pagarSalario();
        System.out.println(tecnico.salario);

        FuncionarioCLT analista = new Analista(1);
        analista.pagarSalario();
        System.out.println(analista.salario);

        FuncionarioCLT gerente = new Gerente(1);
        gerente.pagarSalario();
        System.out.println(gerente.salario);

        FuncionarioCLT diretor = new Diretor();
        diretor.pagarSalario();
        System.out.println(diretor.salario);

        FuncionarioPJ empresaX = new EmpresaX();
        empresaX.pagarSalario();
        System.out.println(empresaX.salario);
    }
}
