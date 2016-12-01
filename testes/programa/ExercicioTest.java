package programa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import academia.Exercicio;

public class ExercicioTest {
	private Exercicio exer1;
	
	
	
	@Before
	public void criaExercicio() throws Exception{
		exer1 = new Exercicio("abdominal", 200);
	
	}
	
	
	@Test
	public void testExercicio() {
		assertEquals("abdominal", exer1.getNome());
		assertEquals(200, exer1.getCph(),000.5);
	
	}
	
	@Test
	public void testExercicioComException() throws Exception{
		try{
			Exercicio exer2 = new Exercicio(null, 200);
		}catch(Exception e){
			assertEquals("Nome nao pode ser null ou vazio.", e.getMessage());
		}
	
	}
	@Test
	public void testExercicioComException2() throws Exception{
		try{
			Exercicio exer3 = new Exercicio("correr", -1.5);
		}catch(Exception e){
			assertEquals("Calorias gastas por hora deve ser maior que zero.", e.getMessage());
		}
	
	}
	
	@Test
	public void testToString(){
		assertEquals("Exercicio [nome=abdominal, cph=200.0]", exer1.toString());
	}
	@Test
	public void testCalPorMinutos(){
		assertEquals(10,exer1.calPerMinutes(3), 000.5);
		
	}
	@Test
	public void testCalPerMinutes() throws Exception {
	 assertEquals("Valor de cal por minutos incorreto.", 100, exer1.calPerMinutes(30), 0.05);
	 assertEquals("Valor de cal por minutos incorreto.", 0,exer1.calPerMinutes(0), 0.05);
	}
	
	
	
	
	
	
	@Test
	public void testEqualsObject() throws Exception {
		assertEquals(exer1, exer1);
		Exercicio exc2 = new Exercicio("abdominal", 200);
		assertEquals(exer1, exc2);
		Exercicio exc3 = new Exercicio("corrida", 700);
		assertNotEquals(exer1, exc3);
		Exercicio exc4 = new Exercicio("abdominal", 200.1);
		assertNotEquals(exer1, exc4);
		Exercicio exc5 = new Exercicio("natacao", 700);
		assertNotEquals(exc3, exc5);
	}


	
}
