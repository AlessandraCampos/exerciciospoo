package com.exercicios.PooExercicios;

public class Veiculo implements InterfaceVeiculo{
	
	private String marca;
	private String modelo;
	private String placa;
	public Veiculo() {

	}
	private String cor;
	private float km=000000;
	private boolean isLigado=false;
	private int litrosCombustivel=5;
	private int velocidade;
	private double preco;
	
	
	
	public void acelerar() {
		if(isLigado==false) {
			System.out.println("É necessario ligar o veículo");
		}else {
			if (litrosCombustivel <= 0) {
				System.out.println("Veiculo sem combustível não é possível acelerar");
				isLigado=false;
				velocidade=0;
			
			}else if(litrosCombustivel >= 0 && litrosCombustivel <=3) {
				System.out.println("É necessário abastecer o veículo");
				velocidade +=10;
				km +=10;
				litrosCombustivel -=3;
			}else {
				km +=10;
				litrosCombustivel -=2;
				  if(velocidade<=200) {
					  velocidade +=20;
				  }else {
					  System.out.println("Só é possível acelerar até 200km");
				  }
		}
		
		
		}
		
		
		
	}
    public Veiculo(String marca, String modelo, String placa, String cor, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.preco = preco;
	}
    
	public void abastecer(int combustivel) {
		velocidade =0;
		isLigado= false;
    	
    	if(litrosCombustivel + combustivel  <= 60) {
    		litrosCombustivel += combustivel;
    	}else {
    		System.out.println("Não é possível abastecer acima de 60 litros");
    	}
		
	}
    public void frear() {
    	if(velocidade==0 || isLigado== false) {
    		System.out.println("Não é possível frear com o veiculo parado ou desligado");
    	} else {
    		velocidade -= 20;
    	}
    	
	
    }
    public void pintar(String cor) {
    	this.setCor(cor);
	
    }
    public void ligar() {
    	if (isLigado== false) {
    		isLigado =true;
    		System.out.println("Veiculo ligado");
    	}else {
    		System.out.println("O veículo já está ligado");
    	}
    	
    }
    public void desligar() {
    	if (isLigado== false) {
    		System.out.println("O veículo já está desligado");
    	}else if(velocidade > 0) {
    		System.out.println("O veículo não pode ser desligado em movimento ");
    	}else {
    		isLigado = false;
    		System.out.println("Veiculo desligado com sucesso");
    		
    	}
    	
    }
	
	
	
		
	
	
	
	@Override
	public String toString() {
		return "Veiculo [marca=" + this.marca + ", modelo=" + this.modelo + ", placa=" + this.placa + ", cor=" + this.cor + ", km=" + this.km
				+ ", isligado=" + isLigado + ", litrosCombustivel=" + this.litrosCombustivel + ", velocidade=" + this.velocidade
				+ ", preco=" + this.preco + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isIsligado() {
		return isLigado;
	}
	public void setIsligado(boolean isligado) {
		this.isLigado = isligado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}
