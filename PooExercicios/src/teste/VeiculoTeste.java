package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exercicios.PooExercicios.Veiculo;

class VeiculoTeste {

	@Test
	void deveAcelerarOCarro() {
		Veiculo veiculo = new Veiculo();
		veiculo.acelerar();
	}

}
