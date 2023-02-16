package Datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DiasUteis {
	
	public static void main(String[] args) {
		
		List<LocalDate> diasUteis = new ArrayList<LocalDate>();
		LocalDate dataInicio = LocalDate.parse("2023-02-07");
		LocalDate dataTermino = LocalDate.parse("2023-02-28");
		LocalDate data;
		List<LocalDate> feriados;
		
		Period dias = Period.between(dataInicio, dataTermino);
		feriados = ConsultarFeriados();
		
		for (int i = 1; i <= dias.getDays(); i++) {
			data = dataInicio.plusDays(i);
			if (!data.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !data.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				if (!feriados.contains(data)) {
					diasUteis.add(data);
				}
			}
		}
		
		System.out.println("Dias Uteis = " + diasUteis.size());
		System.out.println("Dias Corridos = " + dias.getDays());
	}
	
	private static List<LocalDate> ConsultarFeriados(){
		List<LocalDate> lista = new ArrayList<>();
		lista.add(LocalDate.parse("2023-01-01"));
		lista.add(LocalDate.parse("2023-01-25"));
		lista.add(LocalDate.parse("2023-02-20"));
		lista.add(LocalDate.parse("2023-02-21"));
		lista.add(LocalDate.parse("2023-02-22"));
		lista.add(LocalDate.parse("2023-04-07"));
		lista.add(LocalDate.parse("2023-04-21"));
		lista.add(LocalDate.parse("2023-05-01"));
		lista.add(LocalDate.parse("2023-06-08"));
		lista.add(LocalDate.parse("2023-07-09"));
		lista.add(LocalDate.parse("2023-10-12"));
		lista.add(LocalDate.parse("2023-11-02"));
		lista.add(LocalDate.parse("2023-11-15"));
		lista.add(LocalDate.parse("2023-11-20"));
		lista.add(LocalDate.parse("2023-12-25"));
		return lista;
	}

}
