package ClinicaVeterinaria;

public class TesteClinica {
    public static void main(String[] args) {
        ClinicaVet vet = new ClinicaVet();

        ClinicaVet.Clinica cli1 = vet.new Clinica("Top Vet", "Av. Paulista, 225", "4002-8922");
        System.out.println(cli1.toString());

        System.out.println("-----------------------------------------------------------------------");

        ClinicaVet.Recepcionista r1 = vet.new Recepcionista("Adrielle", "1193356-0126");
        String ficha = r1.gerarFicha();

        System.out.println("-");

        ClinicaVet.Recepcionista r2 = vet.new Recepcionista("Bianca", "1194556-0125");
        String fichaDois = r2.gerarFicha();

        ClinicaVet.Animal a1 = vet.new Animal("Totó", "Cachorro", "PitBull", 8);
        ClinicaVet.Animal a2 = vet.new Animal("Polar", "Gato", "Malhado", 2);

        System.out.println("-");

        ClinicaVet.Cliente c1 = vet.new Cliente("Bruna Freitas", "Av. Paulista, 23", "1198225-6073");
        ClinicaVet.Cliente c2 = vet.new Cliente("Calos Dantas", "Av. Getulio Vargas, 100", "1196854-2014");
        System.out.println(c1);
        c1.cadastrarAnimal(a1);
        System.out.println(c2);
        c2.cadastrarAnimal(a2);


        System.out.println("-");

        c1.setNumeroFicha(ficha);
        System.out.println("Número da ficha do cliente " + c1.getNome() + ": " + c1.getNumeroFicha());

        c2.setNumeroFicha(fichaDois);
        System.out.println("Número da ficha do cliente " + c2.getNome() + ": " + c2.getNumeroFicha());

        System.out.println("-");

        ClinicaVet.Medico m1 = vet.new Medico("Dr. Pablo Escobar", "Cardiologista", "123", "1198332-6045");
        m1.atender();

        ClinicaVet.Medico m2 = vet.new Medico("Dra. Luiza Alencar", "Demartologista", "153", "1195245-9654");
        m2.atender();

        System.out.println("-");

        m1.prescreverMedicamento();

        System.out.println("-");

        ClinicaVet.Consulta co1 = vet.new Consulta("29/02/2027", "10h", m1, a1);
        co1.gerarMedicacao();
        ClinicaVet.Consulta co2 = vet.new Consulta("14/10/2026", "15h", m2, a2);
        co2.gerarMedicacao();

        System.out.println("-");

        c1.marcarConsulta(a1, co1);
        c1.marcarConsulta(a2, co2);

        System.out.println("-");

        System.out.println(c1.toString());
        System.out.println(cli1.toString());
        System.out.println(co1.toString());
        System.out.println(m1.toString());
        System.out.println(r1.toString());
        System.out.println(a1.toString());



    }
}
