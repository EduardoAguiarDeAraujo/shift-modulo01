package tipos;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println("Entre com o ano do seu nascimento no formato AAAA: ");
		
		short nasc = sc.nextShort();
		short idade = (short) (hoje.getYear() - nasc);

		System.out.println("Sua idade é " + idade  + "anos.");

		System.out.println("Sua idade é " + Year.now().minusYears(nasc) + "anos.");
		
		LocalDate dataNasc = LocalDate.of(2014,02,22);
		
		long dias = ChronoUnit.DAYS.between(dataNasc, hoje);
		long meses = ChronoUnit.MONTHS.between(dataNasc, hoje);
		
		System.out.println("Idade em dias: " + dias);
		System.out.println("Idade em meses: " + meses);

		System.out.println(dias/365.0);
		System.out.println(meses/12.0);
		
		{
			Period periodo = Period.between(dataNasc,hoje);
			System.out.println("Idade:" + periodo);
			System.out.println("Idade: " + periodo.getYears()+" anos, "+ periodo.getMonths() +" meses, " + periodo.getDays() + " dias");
		}
			
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String hojeFormatado = formatter.format(hoje);
			System.out.println("Hoje: " + hojeFormatado);
		}

		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
			String hojeFormatado = formatter.format(hoje);
			System.out.println("Hoje BR: " + hojeFormatado);
		}
		
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ENGLISH);
			String hojeFormatado = formatter.format(hoje);
			System.out.println("Hoje US: " + hojeFormatado);
		}
		
		sc.close();
		
	}

}
