package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
//		opController.OpString();
//		opController.OpBuffer();
		
		String frase = "oi oi oi oi oi oi oi oi oi";
		opController.OpFrase(frase);
	}

}
