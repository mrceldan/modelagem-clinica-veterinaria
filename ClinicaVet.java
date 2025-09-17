package src.ClinicaVeterinaria;
import java.util.Random;

class ClinicaVet {
    public class Medico {
        private String nome;
        private String especialidade;
        private String crm;
        private String telefone;

        public Medico(String nome, String especialidade, String crm, String telefone) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.crm = crm;
            this.telefone = telefone;
        }

        public void atender() {
            System.out.println("O(a) médico " + nome + " no momento está ocupado atendendo um paciente.");
        }

        public void prescreverMedicamento() {
            System.out.println("O(a) médico " + nome + " prescreveu um medicamento.");
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Cadastro do médico realizado! Informações do(a) médico -> " + " Nome: " + nome + " | " + "Especialidade: " + especialidade + " | " + "CRM:" + crm + " | " + "Telefone: " + telefone;
        }
    }

    public class Animal {
        private String nome;
        private String especie;
        private String raca;
        private int idade;

        public Animal(String nome, String especie, String raca, int idade) {
            this.nome = nome;
            this.especie = especie;
            this.raca = raca;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + " | " +
                    " Especie: " + especie + " | " +
                    " Raça: " + raca + " | " +
                    " Idade: " + idade;
        }
    }

    public class Cliente {
        private String nome;
        private String endereco;
        private String telefone;

        private Animal animal;
        private Consulta consulta;

        private String numeroFicha; // <-- aqui o número da ficha

        public Cliente(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;

        }

        public void marcarConsulta(Animal animal, Consulta consulta) {
            this.animal = animal;
            this.consulta = consulta;
            System.out.println("A consulta do(a) paciente " + animal.getNome() + ", do dono(a): " + this.nome +
                    " foi agendada para: " + consulta.getData() + " às " + consulta.getHora());
        }

        public void cadastrarAnimal(Animal animal) {
            this.animal = animal;
            System.out.println("Informações do(a) animal do(a) cliente -> " + animal);
        }

        public String getNumeroFicha() {
            return numeroFicha;
        }

        public void setNumeroFicha(String numeroFicha) {
            this.numeroFicha = numeroFicha;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Cadastro do cliente realizado! Informações do cliente -> " +
                    "Nome: " + nome +
                    " | Endereco: " + endereco +
                    " | Telefone: " + telefone;
        }
    }

    public class Consulta {
        private String data;
        private String hora;

        private Medico medico;
        private Animal animal;

        public Consulta(String data, String hora, Medico medico, Animal animal) {
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.animal = animal;
        }

        public String getData() {
            return data;
        }

        public String getHora() {
            return hora;
        }

        public void gerarMedicacao() {
            System.out.println("Medicação gerada para consulta do animal: " + animal.nome);
        }

        @Override
        public String toString() {
            return "Cadastro da consulta realizada! Informações da consulta ->" + " Data: " + data + " | " + "Hora: " + hora + " | " + "Medico: " + medico.nome + " | " + "Animal: " + animal.nome;
        }
    }

    public class Clinica {
        private String nome;
        private String endereco;
        private String telefone;

        public Clinica(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return " | " + nome + " | " +
                    " END: " + endereco + " | " +
                    " TEL: " + telefone + " | ";
        }
    }

    public class Recepcionista {
        private String nome;
        private String telefone;
        private Random random = new Random();

        public Recepcionista(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        public String gerarFicha() {
            int numeroFicha = random.nextInt(9000) + 1000;
            System.out.println("Ficha nº " + numeroFicha + " gerada pela recepcionista " + nome);
            return String.valueOf(numeroFicha);
        }

        @Override
        public String toString() {
            return "Cadastro da recepção realizado! Informações do funcionario(a) -> " + "Nome: " + nome + " | " + "Telefone: " + telefone;
        }
    }
}