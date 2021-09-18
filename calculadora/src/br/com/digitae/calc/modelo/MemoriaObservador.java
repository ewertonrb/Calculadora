package br.com.digitae.calc.modelo;


@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);

}
