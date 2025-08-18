public class Principal {
    public static void main(String[] args) {
        PF pf1 = new PF();
        pf1.setCPF("08911406112");
        pf1.setDataNascimento("05/03/1983");
        pf1.setNome("Japinha");
        pf1.setTelefone("61995426629");

        
        System.out.println("Nome: " + pf1.getNome());
        System.out.println("CPF: " + pf1.getCPF());
        System.out.println("Data de Nascimento: " + pf1.getDataNascimento());
        System.out.println("Telefone: " + pf1.getTelefone());
    }
}
