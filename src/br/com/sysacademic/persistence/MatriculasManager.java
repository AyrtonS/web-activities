package br.com.sysacademic.persistence;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.sysacademic.entidades.Matriculas;

public class MatriculasManager {
	
	private static HashMap<String, ArrayList<Matriculas>> matriculas = new HashMap<String,ArrayList<Matriculas>>(4);
	public static ArrayList<Matriculas> lista = new ArrayList<Matriculas>();
	
	public static HashMap<String, ArrayList<Matriculas>> getMatriculas() {
		return matriculas;
	}

	public static void setMatriculas(HashMap<String, ArrayList<Matriculas>> matriculas) {
		matriculas = matriculas;
	}
	public static void addMatricula(Matriculas matricula){
	
		lista.add(matricula);
		matriculas.put(matricula.getCod_disciplina(), lista);
	}
}
