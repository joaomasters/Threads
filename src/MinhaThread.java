
public class MinhaThread extends Thread{

	private String nome;
	private int tempo;
	
	public MinhaThread(String nome) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	public void run() {
		
		try {
		for(int i=0; i<24; i++) {
			System.out.println(nome + " contador " + i);
			Thread.sleep(1000);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
	}
	

}
