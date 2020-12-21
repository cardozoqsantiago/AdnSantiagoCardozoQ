package com.ceiba.dominio;

import static com.ceiba.dominio.ValidadorArgumento.validarDiaHabil;
import static com.ceiba.dominio.constantes.ConstantesUtil.NO_SE_PUEDEN_HACER_RESERVAS;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ValidadorFechas {
	
	private ValidadorFechas() {}
	
	public static LocalDate validarFechas(LocalDate fecha) {
		validarDiaHabil(esDiaHabil(fecha), NO_SE_PUEDEN_HACER_RESERVAS);
		return obtenerDiaHabilSiquiente(fecha);
	}
	
	private static LocalDate obtenerDiaHabilSiquiente(final LocalDate fecha) {
		return obtenerDiaHabil(fecha.plusDays(1));
	}
	
	private static LocalDate obtenerDiaHabil(final LocalDate fecha) {
		LocalDate dia = fecha;
		while (!esDiaHabil(dia)) {
			dia = dia.plusDays(1);
		}
		return dia;
	}
		
    public static boolean esDiaHabil(final LocalDate fecha) {
        return !(fecha == null || fecha.getDayOfWeek() == DayOfWeek.SATURDAY
                || fecha.getDayOfWeek() == DayOfWeek.SUNDAY);
    }

}
