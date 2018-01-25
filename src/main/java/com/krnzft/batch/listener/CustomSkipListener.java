package com.krnzft.batch.listener;

import org.springframework.batch.core.SkipListener;
import org.springframework.batch.item.file.FlatFileParseException;

public class CustomSkipListener implements SkipListener<Object, Object> {

	@Override
	public void onSkipInProcess(Object item, Throwable t) {
		StringBuilder message = new StringBuilder("ERROR en PROCESADO: ").append(t.getMessage());
        
        System.out.println(message.toString());

	}

	@Override
	public void onSkipInRead(Throwable t) {
		StringBuilder message = new StringBuilder("ERROR EN LECTURA");
		if (t instanceof FlatFileParseException) {
			FlatFileParseException e = (FlatFileParseException)t;
			message.append(" Linea ")
				.append(e.getLineNumber())
				.append(": Error en el formato para la siguiente entrada: ")
				.append(e.getInput());
		} else {
			message.append(t.getMessage());
		}
		
		System.out.println(message.toString());

	}

	@Override
	public void onSkipInWrite(Object item, Throwable t) {
		StringBuilder message = new StringBuilder("ERROR EN ESCRITURA: ").append(t.getMessage());
		
		System.out.println(message.toString());
	}

}
