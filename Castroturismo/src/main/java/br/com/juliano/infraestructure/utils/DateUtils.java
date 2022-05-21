package br.com.juliano.infraestructure.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe que converte datas
 * 
 * @author Juliano Roque Vieira
 *
 */
public class DateUtils {

	/**
	 * Converter uma String em Data
	 * 
	 * @param dataStr - Data em formato de Textor dd/MM/yyyy
	 * @return Date
	 */
	public static Date getDateFromString(String dataStr) {
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, Integer.parseInt(dataStr.substring(6, 10)));
		data.set(Calendar.MONTH, Integer.parseInt(dataStr.substring(3, 5)));
		data.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataStr.substring(0, 2)));
		return data.getTime();
	}

}
