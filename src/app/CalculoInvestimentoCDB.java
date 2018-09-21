package app;

public class CalculoInvestimentoCDB {

	public static float calcularValorIR(int n, double p, double i, double d) {
		float resposta = 0.00f;
		
		resposta = (float) (p * n/365 * i * d);
		
		return resposta;
	}

	public static float calcularRendimentoLiquido(int n, double p, double i, double d) {
		float resposta = 0.00f;
		
		resposta = (float) (((((p * n/365 * i)-(p * n/365 * i * d)+ p)/p)*100)-100);
		
		return resposta;
	}

	public static float calcularRendimentoBruto(int n, double p, double i, double d) {
		float resposta = 0.00f;
		
		resposta = (float) (p * n/365 * i);
				
		return resposta;
	}

}
