package program;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entities.Funcionario;
import utils.enums.Role;

public class Principal {
	public static void insertEmployees(ArrayList<Funcionario> employeesList) {
		employeesList.add(new Funcionario("Maria", LocalDate.of(2000, Month.OCTOBER, 18), BigDecimal.valueOf(2009.44), Role.OPERADOR.getValor()));
		employeesList.add(new Funcionario("João", LocalDate.of(1990, Month.MAY, 12), BigDecimal.valueOf(2284.38), Role.OPERADOR.getValor()));
		employeesList.add(new Funcionario("Caio", LocalDate.of(1961, Month.MAY, 2), BigDecimal.valueOf(9836.14), Role.COORDENADOR.getValor()));
		employeesList.add(new Funcionario("Miguel", LocalDate.of(1988, Month.OCTOBER, 14), BigDecimal.valueOf(19119.88), Role.DIRETOR.getValor()));
		employeesList.add(new Funcionario("Alice", LocalDate.of(1995, Month.JANUARY, 5), BigDecimal.valueOf(2234.68), Role.RECEPCIONISTA.getValor()));
		employeesList.add(new Funcionario("Heitor", LocalDate.of(1999, Month.NOVEMBER, 19), BigDecimal.valueOf(1582.72), Role.OPERADOR.getValor()));
		employeesList.add(new Funcionario("Arthur", LocalDate.of(1993, Month.MARCH, 31), BigDecimal.valueOf(4071.84), Role.CONTADOR.getValor()));
		employeesList.add(new Funcionario("Laura", LocalDate.of(1994, Month.JULY, 8), BigDecimal.valueOf(3017.45), Role.GERENTE.getValor()));
		employeesList.add(new Funcionario("Heloísa", LocalDate.of(2003, Month.MAY, 24), BigDecimal.valueOf(1606.85), Role.ELETRICISTA.getValor()));
		employeesList.add(new Funcionario("Helena", LocalDate.of(1996, Month.SEPTEMBER, 2), BigDecimal.valueOf(2799.93), Role.GERENTE.getValor()));
	}

	public static void removeEmployeeByName(ArrayList<Funcionario> employeesList, String name) {
		employeesList.removeIf(f -> f.getNome().equals(name));
	}
	
	public static void printEmployees(ArrayList<Funcionario> employeesList) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.println("Lista de todos os funcionários");
        
        for (Funcionario employee : employeesList) {
        	String name = employee.getNome();
        	String date = dtf.format(employee.getDataNascimento());
        	String salary = df.format(employee.getSalario());
        	String role = employee.getFuncao();

            System.out.println("Nome: " + name + ", Data de nascimento: " + date + ", Salário: R$ " + salary + ", Função: " + role);
        }
	}

	public static void main(String[] args) {
		ArrayList<Funcionario> employeesList = new ArrayList<>();

		insertEmployees(employeesList);
		
		removeEmployeeByName(employeesList, "João");
		
		printEmployees(employeesList);
	}
}
